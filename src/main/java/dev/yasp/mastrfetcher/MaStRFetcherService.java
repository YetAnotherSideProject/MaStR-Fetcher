package dev.yasp.mastrfetcher;

import dev.yasp.mastrfetcher.dao.AnlagenMonatsBestandRepository;
import dev.yasp.mastrfetcher.model.AnlagenMonatsBestand;
import dev.yasp.mastrfetcher.model.EinheitDTO;
import dev.yasp.mastrfetcher.soapclient.StromerzeugerClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Component
public class MaStRFetcherService {
    private static final Logger LOG = LoggerFactory.getLogger(MaStRFetcherService.class);
    private final StromerzeugerClient client;
    private final AnlagenMonatsBestandRepository repository;

    public MaStRFetcherService(StromerzeugerClient client, AnlagenMonatsBestandRepository repository) {
        this.client = client;
        this.repository = repository;
    }

    public void fetchData(int gemeindeSchluessel, boolean completeFetch) {
        // TODO complete Fetch evalurieren ob NICHT überhaupt sinnvoll ist
        LOG.info("Anlagen Daten abfragen: Gemeindeschlüssel={}, completeFetch={}", gemeindeSchluessel, completeFetch);
        List<Pair<YearMonth, List<EinheitDTO>>> monatsRohDaten = new ArrayList<>();

        // Start zur Jahrtausendwende, davor nur minimale Daten
        // TODO konfigurierbar machen
        // TODO Zusätzlich zu den reinen MOnatsdaten alle PV Anlagen > 30 KW rausfiltern und mit Standort speichern für Karten Anzeige
        YearMonth month = YearMonth.of(2010, 1);
        // Abfrage der Daten vor dem Startmonat (bis 1. Tag des Monats) für Aggregation
        List<EinheitDTO> before = this.fetchData(gemeindeSchluessel, LocalDate.MIN, month.atDay(1));
        // Abfrage aller Monate ab Startmonat bis zum letzten
        // TODO Abfragen parallelisieren, API Limits prüfen
        while(month.isBefore(YearMonth.now())) {
            monatsRohDaten.add(Pair.of(
                    month,
                    this.fetchData(
                            gemeindeSchluessel,
                            // Nach dem letzten Tag des Vormonats
                            month.atDay(1).minusDays(1),
                            // Vor dem ersten Tag des Folgemonats
                            month.atEndOfMonth().plusDays(1))));
            month = month.plusMonths(1);
        }

        this.aggregateAndSaveMonthData(
                gemeindeSchluessel,
                before.size(),
                before.stream().map(EinheitDTO::bruttoleistung).reduce(BigDecimal.ZERO, BigDecimal::add),
                monatsRohDaten);
    }

    private void aggregateAndSaveMonthData(int gemeindeSchluessel, int baseAnlagenAnz, BigDecimal baseLeistung, List<Pair<YearMonth, List<EinheitDTO>>> monatsRohDaten) {
        // Sortieren in richtiger Monatsreihenfolge für kommende Aggregationsberechnung, wichtig, falls Abfragen paralellisiert
        monatsRohDaten.sort(Comparator.comparing(Pair::getFirst));

        // Daten aggregieren und in Persistenz Objekte überführen
        List<AnlagenMonatsBestand> monatsDaten = new ArrayList<>();
        for(Pair<YearMonth, List<EinheitDTO>> currentMonthData : monatsRohDaten) {
            int zubauAnlagen = currentMonthData.getSecond().size();
            BigDecimal zubauLeistung = currentMonthData.getSecond().stream()
                    .map(EinheitDTO::bruttoleistung)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
            if(monatsDaten.isEmpty()) {
                // 1. Monat, keine Vormonatsaggregation
                monatsDaten.add(new AnlagenMonatsBestand(
                        gemeindeSchluessel,
                        currentMonthData.getFirst().toString(),
                        baseAnlagenAnz + zubauAnlagen,
                        zubauAnlagen,
                        baseLeistung.add(zubauLeistung),
                        zubauLeistung));
            } else {
                // Aggregieren Summen über Vormonat - Durch if Abfrage kein Null pointer möglich
                int anzAnlagen = CollectionUtils.lastElement(monatsDaten).getAnzahlAnlagen() + zubauAnlagen;
                BigDecimal bruttoLeistung = CollectionUtils.lastElement(monatsDaten).getBruttoleistung().add(zubauLeistung);
                monatsDaten.add(new AnlagenMonatsBestand(
                        gemeindeSchluessel,
                        currentMonthData.getFirst().toString(),
                        anzAnlagen,
                        zubauAnlagen,
                        bruttoLeistung,
                        zubauLeistung));
            }
        }

        LOG.info("Persist monthly data to database");
        this.repository.saveAll(monatsDaten);
    }

    private List<EinheitDTO> fetchData(int gemeindeschluessel, LocalDate after, LocalDate before) {
        LOG.info("Daten abfragen für Gemeindeschlüssel {}, Zeitraum nach {} bis {}", gemeindeschluessel, after, before);
        // TODO Mapping Gemeindeschlüssel auf PLZ (möglicherweise mehrere, manuelles abspeichern in DB?)
        return this.client.requestPVEinheiten(48268, after, before);
    }
}