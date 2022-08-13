package dev.yasp.mastrfetcher;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.yasp.mastrfetcher.client.StromerzeugerClient;
import dev.yasp.mastrfetcher.dao.AusbauMonatRepository;
import dev.yasp.mastrfetcher.dao.GemeindeRepository;
import dev.yasp.mastrfetcher.model.Anlage;
import dev.yasp.mastrfetcher.model.AusbauMonat;
import dev.yasp.mastrfetcher.model.Gemeinde;
import dev.yasp.mastrfetcher.wsdl.Einheit;

@SpringBootApplication
public class MaStRFetcherApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaStRFetcherApplication.class, args);
    }

    @Bean
    CommandLineRunner fetcher(StromerzeugerClient stromerzeugerClient, GemeindeRepository gemeindeRepository, AusbauMonatRepository ausbauMonatRepository) {
        return args -> {
            System.out.println("Testing Datenabfrage");
            //TODO
            int plz = 48268;
            int gemeindeSchluessel = 5566012;
            String gemeindeName = "Greven";
            int einwohner = 37864;
            LocalDate einwohnerStand = LocalDate.of(2020,6,30);
            YearMonth currentMonth = YearMonth.now();

            //Historie
            System.out.println("Abfrage der Einheiten in den letzten 12 Monaten");
            List<AusbauMonat> ausbauMonate = new ArrayList<>();
            int gesamtAnlagen = 0;
            BigDecimal gesamtBruttoleistung = BigDecimal.ZERO;
            for(int i = 1; i <= 12; i++) {
                List<Einheit> monatsEinheiten = stromerzeugerClient.getPVEinheiten(plz, currentMonth.minusMonths(i), false, false);
                AusbauMonat monat = new AusbauMonat(gemeindeSchluessel, currentMonth.minusMonths(i).toString(), monatsEinheiten.size(),
                        monatsEinheiten.stream().map(Einheit::getBruttoleistung).reduce(BigDecimal.ZERO, BigDecimal::add));
                gesamtAnlagen += monat.getAnzahlAnlagen();
                gesamtBruttoleistung = gesamtBruttoleistung.add(monat.getBruttoleistung());
                ausbauMonate.add(monat);
            }

            //Gemeinde
            System.out.println("Abfrage der Einheiten vor den letzten 12 Monaten");
            List<Einheit> einheitenVorHist = stromerzeugerClient.getPVEinheiten(plz, currentMonth.minusMonths(13), true, false);
            Gemeinde gemeinde = new Gemeinde(gemeindeSchluessel, gemeindeName, einwohner, einwohnerStand,
                    einheitenVorHist.size()+gesamtAnlagen,
                    einheitenVorHist.stream().map(Einheit::getBruttoleistung).reduce(BigDecimal.ZERO, BigDecimal::add).add(gesamtBruttoleistung),
                    currentMonth.minusMonths(1).atEndOfMonth());

            //Daten persisiteren, Gemeinde muss als Erstes existieren für Foreign Key
            gemeindeRepository.save(gemeinde);
            ausbauMonatRepository.saveAll(ausbauMonate);

            //Größte Anlagen
            System.out.println("Abfrage der größten Anlagen");
            List<Einheit> grosseEinheiten = stromerzeugerClient.getPVEinheiten(plz, currentMonth.minusMonths(1), true, true);
            //TODO Alternativen prüfen und Anzahl noch hardcoded
            List<Anlage> grosseAnlagen = grosseEinheiten.stream()
                    .sorted(Comparator.comparing(Einheit::getBruttoleistung))
                    .skip(grosseEinheiten.size()-20)
                    .map(e -> {return new Anlage(gemeindeSchluessel, e.getEinheitMastrNummer(), e.getStandort(), e.getBruttoleistung());})
                    .toList();
            System.out.println("Finished");
        };
    }
}
