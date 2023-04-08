package dev.yasp.mastrfetcher.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import dev.yasp.mastrfetcher.client.GetGefilterteListeStromErzeugerRequestBuilder;
import dev.yasp.mastrfetcher.client.StromerzeugerClient;
import dev.yasp.mastrfetcher.model.AnlageDetail;
import dev.yasp.mastrfetcher.model.AnlageDetailRepository;
import dev.yasp.mastrfetcher.model.PvBestandMonat;
import dev.yasp.mastrfetcher.model.PvBestandMonatRepository;
import dev.yasp.mastrfetcher.webservice.AnlagenBetriebsStatusEnum;
import dev.yasp.mastrfetcher.webservice.Einheit;
import dev.yasp.mastrfetcher.webservice.EnergietraegerEnum;

import jakarta.transaction.Transactional;
import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.*;

@Component
public class PvAnlagenService {

    private static final Logger LOG = LoggerFactory.getLogger(PvAnlagenService.class);
    //Injected by Spring Context via Constructor
    private final StromerzeugerClient stromerzeugerClient;
    private final PvBestandMonatRepository pvBestandMonatRepository;
    private final AnlageDetailRepository anlageDetailRepository;

    public PvAnlagenService(StromerzeugerClient stromerzeugerClient,
                            PvBestandMonatRepository pvBestandMonatRepository,
                            AnlageDetailRepository anlageDetailRepository) {
        this.stromerzeugerClient = stromerzeugerClient;
        this.pvBestandMonatRepository = pvBestandMonatRepository;
        this.anlageDetailRepository = anlageDetailRepository;
    }

    @Transactional //TODO prüfen, ob auf dieser Ebene korrekt? Soll eigentlich nur DB Calls bündeln
    public void pvAnlagenAbfragenUndAufbereiten(String gemeindeschluessel, YearMonth inbetriebnahmeStartMonat,
                                                YearMonth inbetriebnahmeEndMonat) {
        LOG.info("PV Anlagen abfragen & aufbereiten für Gemeindeschlüssel {}, von Inbetriebnahme {} bis {}",
                gemeindeschluessel,
                inbetriebnahmeStartMonat,
                inbetriebnahmeEndMonat);

        //TODO eventuell Parallelisierung möglich
        this.monatlicheBestandsdatenErzeugen(gemeindeschluessel, inbetriebnahmeStartMonat, inbetriebnahmeEndMonat);
        this.grosseAnlagenAufbereiten(gemeindeschluessel, inbetriebnahmeEndMonat);
    }

    private void monatlicheBestandsdatenErzeugen(String gemeindeschluessel, YearMonth startMonat, YearMonth endMonat) {
        LOG.info("Monatliche Bestands- & Zubaudaten abfragen & aggregieren");
        //TODO Mapping Gemeindeschlüssel --> PLZ (1:n)
        var plz = "48268";
        //Erzeugen aller Monatsintervalle
        //TODO ggf. effizienter möglich, wirkt unsauber
        Set<YearMonth> monate = new HashSet<>();
        int i = 0;
        while (!monate.contains(endMonat)) {
            monate.add(startMonat.plusMonths(i++));
        }

        LOG.info("Abfragen von Daten für {} Monatsintervalle", monate.size());
        //TODO Parallelisierung prüfen, bei parallelStream werden Abfragen mit identischer Parametrisierung erzeugt
        //  ggf. nicht über Stream sondern ExecutorService
        var anlagenMonatlich = monate.stream()
                .map(monat -> {
                    //TODO Ggf. in eine Methode ausgliedern, welche dann in map verwendet wird
                    return Pair.of(monat, this.stromerzeugerClient.gefilterteListeStromerzeuger(
                            this.basisPVRequestBuilder(plz)
                                    //Nach dem letzten Tag des Vormonats
                                    .mitInbetriebnahmeGroesser(monat.atDay(1).minusDays(1))
                                    //Vor dem ersten Tag des Folgemonats
                                    .mitInbetriebnahmeKleiner(monat.atEndOfMonth().plusDays(1))));
                })
                .sorted(Comparator.comparing(Pair::getFirst))
                .toList();
        LOG.info("PV Anlagen für {} Monatsintervalle abgefragt", anlagenMonatlich.size());

        LOG.info("PV Anlagen vor den Monatsintervallen abfragen & aggregieren");
        var anlagenBasis = this.stromerzeugerClient.gefilterteListeStromerzeuger(
                this.basisPVRequestBuilder(plz).mitInbetriebnahmeKleiner(startMonat.atDay(1)));
        var anlagenAnzahlBasis = anlagenBasis.size();
        var anlagenLeistungBasis = this.summeBruttoleistung(anlagenBasis);

        //Monatsintervalle aggregieren
        List<PvBestandMonat> bestandMonate = new ArrayList<>();
        for (var monat : anlagenMonatlich) {
            //Bestand & Zubaudaten des Monats
            var bestandMonat = new PvBestandMonat(gemeindeschluessel, monat.getFirst());
            bestandMonat.setZubauAnzahl(monat.getSecond().size());
            bestandMonat.setZubauLeistung(this.summeBruttoleistung(monat.getSecond()));
            //1. Monat mit den basisDaten beginnen, danach jeweils auf dem Vormonat
            if (bestandMonate.isEmpty()) {
                bestandMonat.setAnzahlAnlagen(anlagenAnzahlBasis + bestandMonat.getZubauAnzahl());
                bestandMonat.setBruttoleistung(anlagenLeistungBasis.add(bestandMonat.getZubauLeistung()));
            } else {
                //Letztes aggregiertes Objekt bildet die Vormonatsdaten, da sortiert
                var vormonat = Objects.requireNonNull(CollectionUtils.lastElement(bestandMonate));
                bestandMonat.setAnzahlAnlagen(vormonat.getAnzahlAnlagen() + bestandMonat.getZubauAnzahl());
                bestandMonat.setBruttoleistung(vormonat.getBruttoleistung().add(bestandMonat.getZubauLeistung()));
            }
            // Aggregiertes Objekt fertig
            bestandMonate.add(bestandMonat);
        }
        LOG.info("Bestands & Zubaudaten für {} Monate aggregiert", bestandMonate.size());

        this.pvBestandMonatRepository.saveAll(bestandMonate);
        LOG.info("Bestandsdaten monatlich aggregiert wurden persistiert");
    }

    /*
    Große Anlage ist definiert als Nettoleistung > 30 kWp.
    Dann werden Detailinfos (u.A. Adresse) im MaStR veröffentlicht.
     */
    private void grosseAnlagenAufbereiten(String gemeindeschluessel, YearMonth endMonat) {
        LOG.info("Große PV Anlagen filtern und Detailangaben aufbereiten");
        //TODO Mapping Gemeindeschlüssel --> PLZ (1:n)
        var plz = "48268";
        var groessteAnlagen = this.stromerzeugerClient.gefilterteListeStromerzeuger(
                        this.basisPVRequestBuilder(plz)
                                .mitInbetriebnahmeKleiner(endMonat.atEndOfMonth().plusDays(1))
                                .mitNettoleistungGroesser(new BigDecimal(30)))
                .stream()
                /*
                Im Response Objekt ist Nettoleistung nicht mehr vorhanden, Sortierung daher über angelehnte Bruttoleistung
                Sortierung umdrehen, indem im compare objekte vertauscht werden, damit folgendes limit() die größten und nicht die kleinsten Einheiten behält
                 */
                .sorted((e1, e2) -> e2.getBruttoleistung().compareTo(e1.getBruttoleistung()))
                //TODO Wie viele Anlagen? ggf. parametrisiert?
                .limit(25)
                .map(einheit -> this.stromerzeugerClient.einheitSolar(einheit.getEinheitMastrNummer()))
                .map(dto -> new AnlageDetail(gemeindeschluessel, EnergietraegerEnum.SOLARE_STRAHLUNGSENERGIE, dto))
                .toList();
        LOG.info("Detailinformationen für {} PV-Anlagen abgefragt", groessteAnlagen.size());

        this.anlageDetailRepository.deleteByGemeindeschluesselAndEnergietraeger(
                gemeindeschluessel,
                EnergietraegerEnum.SOLARE_STRAHLUNGSENERGIE);
        LOG.info("Vorherige Anlagendaten gelöscht");
        this.anlageDetailRepository.saveAll(groessteAnlagen);
        LOG.info("Anlagendetaildaten wurden persistiert");
    }

    private BigDecimal summeBruttoleistung(List<Einheit> einheiten) {
        return einheiten.stream()
                .map(Einheit::getBruttoleistung)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private GetGefilterteListeStromErzeugerRequestBuilder basisPVRequestBuilder(String plz) {
        return new GetGefilterteListeStromErzeugerRequestBuilder()
                .mitEnergietraeger(EnergietraegerEnum.SOLARE_STRAHLUNGSENERGIE)
                .mitBetriebsstatus(AnlagenBetriebsStatusEnum.IN_BETRIEB)
                .mitPlz(plz);
    }
}