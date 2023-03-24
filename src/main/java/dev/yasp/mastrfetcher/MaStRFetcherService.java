package dev.yasp.mastrfetcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import dev.yasp.mastrfetcher.dao.AnlagenBestandRepository;
import dev.yasp.mastrfetcher.model.AnlagenBestand;
import dev.yasp.mastrfetcher.soapclient.EinheitDTO;
import dev.yasp.mastrfetcher.soapclient.StromerzeugerClient;

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
    private final AnlagenBestandRepository repository;

    public MaStRFetcherService(StromerzeugerClient client, AnlagenBestandRepository repository) {
        this.client = client;
        this.repository = repository;
    }

    public void fetchData(YearMonth startMonth, YearMonth endMonth, int gemeindeSchluessel, boolean completeFetch) {
        // TODO complete Fetch evaluieren ob NICHT überhaupt sinnvoll ist
        LOG.info("Anlagen Daten abfragen: Gemeindeschlüssel={}, completeFetch={}", gemeindeSchluessel, completeFetch);
        List<Pair<YearMonth, List<EinheitDTO>>> monatsRohDaten = new ArrayList<>();

        // Start zur Jahrtausendwende, davor nur minimale Daten
        // TODO konfigurierbar machen
        // TODO Zusätzlich zu den reinen MOnatsdaten alle PV Anlagen > 30 KW rausfiltern und mit Standort speichern für Karten Anzeige
        YearMonth currentMonth = startMonth;
        // Abfrage der Daten vor dem Startmonat (bis 1. Tag des Monats) für Aggregation
        List<EinheitDTO> before = this.fetchData(gemeindeSchluessel, LocalDate.MIN, currentMonth.atDay(1));
        // Abfrage aller Monate ab Startmonat bis zum letzten
        // TODO Abfragen parallelisieren, API Limits prüfen
        while (currentMonth.isBefore(endMonth.plusMonths(1))) {
            monatsRohDaten.add(Pair.of(
                    currentMonth,
                    this.fetchData(
                            gemeindeSchluessel,
                            // Nach dem letzten Tag des Vormonats
                            currentMonth.atDay(1).minusDays(1),
                            // Vor dem ersten Tag des Folgemonats
                            currentMonth.atEndOfMonth().plusDays(1))));
            currentMonth = currentMonth.plusMonths(1);
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
        List<AnlagenBestand> monatsDaten = new ArrayList<>();
        for (Pair<YearMonth, List<EinheitDTO>> currentMonthData : monatsRohDaten) {
            int zubauAnlagen = currentMonthData.getSecond().size();
            BigDecimal zubauLeistung = currentMonthData.getSecond().stream()
                    .map(EinheitDTO::bruttoleistung)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
            if (monatsDaten.isEmpty()) {
                // 1. Monat, keine Vormonatsaggregation
                monatsDaten.add(new AnlagenBestand(
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
                monatsDaten.add(new AnlagenBestand(
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