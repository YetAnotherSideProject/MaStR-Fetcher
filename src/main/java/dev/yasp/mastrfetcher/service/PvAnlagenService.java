package dev.yasp.mastrfetcher.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import dev.yasp.mastrfetcher.client.StromerzeugerClient;
import dev.yasp.mastrfetcher.model.PvBestandMonat;
import dev.yasp.mastrfetcher.model.PvBestandMonatRepository;
import dev.yasp.mastrfetcher.webservice.Einheit;
import dev.yasp.mastrfetcher.webservice.EnergietraegerEnum;

import java.math.BigDecimal;
import java.time.LocalDate;
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
        //TODO Mapping Gemeindeschlüssel --> PLZ (1:n)
        var plz = "48268";
        LOG.info("PV Anlagen abfragen für Postleitzahl {}, von Inbetriebnahme {} bis {}", plz, inbetriebnahmeStartMonat,
                inbetriebnahmeEndMonat);

        //Erzeugen aller Monatsintervalle
        //TODO ggf. effizienter möglich, wirkt unsauber
        Set<YearMonth> monate = new HashSet<>();
        int i = 0;
        while (!monate.contains(inbetriebnahmeEndMonat)) {
            monate.add(inbetriebnahmeStartMonat.plusMonths(i++));
        }

        LOG.info("Abfragen von Daten für {} Monatsintervalle", monate.size());
        //TODO Parallelisierung prüfen, bei parallelStream werden Abfragen mit identischer Parametrisierung erzeugt
        //  ggf. nicht über Stream sondern ExecutorService
        var anlagenMonatlich = monate.stream()
                .map(monat -> {
                    //TODO Ggf. in eine Methode ausgliedern, welche dann in map verwendet wird
                    return Pair.of(monat, this.stromerzeugerClient.gefilterteListeStromerzeuger(
                            EnergietraegerEnum.SOLARE_STRAHLUNGSENERGIE, plz,
                            //Nach dem letzten Tag des Vormonats
                            monat.atDay(1).minusDays(1),
                            //Vor dem ersten Tag des Folgemonats
                            monat.atEndOfMonth().plusDays(1)));
                })
                .sorted(Comparator.comparing(Pair::getFirst))
                .toList();
        LOG.info("PV Anlagen für {} Monatsintervalle abgefragt", anlagenMonatlich.size());

        LOG.info("PV Anlagen vor den Monatsintervallen abfragen & aggregieren");
        var anlagenBasis = this.stromerzeugerClient.gefilterteListeStromerzeuger(
                EnergietraegerEnum.SOLARE_STRAHLUNGSENERGIE, plz, LocalDate.MIN, inbetriebnahmeStartMonat.atDay(1));
        var anlagenAnzahlBasis = anlagenBasis.size();
        var anlagenLeistungBasis = this.summeBruttoleistung(anlagenBasis);

        LOG.info("Daten monatlich aggregieren & Anlagen > 30 kWp zusätzlich filtern");
        //Große Anlagen vor den Monatsintervallen
        List<Einheit> grosseAnlagen = new ArrayList<>(this.filterGrosseAnlagen(anlagenBasis));

        //Monatsintervalle aggregieren & große Anlagen identifizieren
        List<PvBestandMonat> bestandMonate = new ArrayList<>();
        for (var monat : anlagenMonatlich) {
            //Große Anlagen des Monats
            grosseAnlagen.addAll(this.filterGrosseAnlagen(monat.getSecond()));
            //Bestand & Zubaudaten des Monats
            var bestandMonat = new PvBestandMonat();
            bestandMonat.setGemeindeschluessel(gemeindeschluessel);
            bestandMonat.setMonat(monat.getFirst());
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

        LOG.info("{} große Anlagen identifiziert", grosseAnlagen.size());
        //TODO Datenaufbereitung große Anlagen
    }

    private List<Einheit> filterGrosseAnlagen(List<Einheit> einheiten) {
        /*
        Große Anlagen sind definiert als größer 30 kWp Nettoleistung im MaStR (Dann werden Adresse etc. veröffentlicht)
        Einheit bietet keinen Zugriff auf Nettoleistung, also als Annäherung Bruttoleistung nehmen
         */
        return einheiten.stream()
                .filter(einheit -> einheit.getBruttoleistung().compareTo(new BigDecimal(30)) > 0)
                .toList();
    }

    private BigDecimal summeBruttoleistung(List<Einheit> einheiten) {
        return einheiten.stream()
                .map(Einheit::getBruttoleistung)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
