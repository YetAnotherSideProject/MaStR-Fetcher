package dev.yasp.mastrfetcher.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import dev.yasp.mastrfetcher.client.GetGefilterteListeStromErzeugerRequestBuilder;
import dev.yasp.mastrfetcher.client.StromerzeugerClient;
import dev.yasp.mastrfetcher.model.PvBestandMonat;
import dev.yasp.mastrfetcher.model.PvBestandMonatRepository;
import dev.yasp.mastrfetcher.webservice.AnlagenBetriebsStatusEnum;
import dev.yasp.mastrfetcher.webservice.Einheit;
import dev.yasp.mastrfetcher.webservice.EnergietraegerEnum;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.*;

@Component
public class PvAnlagenService {

    private static final Logger LOG = LoggerFactory.getLogger(PvAnlagenService.class);
    private final StromerzeugerClient stromerzeugerClient; //Injected by Spring via Constructor
    private final PvBestandMonatRepository pvBestandMonatRepository; //Injected by Spring via Constructor

    public PvAnlagenService(StromerzeugerClient stromerzeugerClient,
                            PvBestandMonatRepository pvBestandMonatRepository) {
        this.stromerzeugerClient = stromerzeugerClient;
        this.pvBestandMonatRepository = pvBestandMonatRepository;
    }

    public void pvAnlagenAbfragenUndAufbereiten(String gemeindeschluessel, YearMonth inbetriebnahmeStartMonat,
                                                YearMonth inbetriebnahmeEndMonat) {
        LOG.info("PV Anlagen abfragen & aufbereiten für Gemeindeschlüssel {}, von Inbetriebnahme {} bis {}",
                gemeindeschluessel,
                inbetriebnahmeStartMonat,
                inbetriebnahmeEndMonat);

        this.monatlicheBestandsdatenErzeugen(gemeindeschluessel, inbetriebnahmeStartMonat, inbetriebnahmeEndMonat);
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

                .toList();
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