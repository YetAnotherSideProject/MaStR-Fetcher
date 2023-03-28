package dev.yasp.mastrfetcher;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import dev.yasp.mastrfetcher.dao.AnlagenBestandRepository;
import dev.yasp.mastrfetcher.model.AnlagenBestand;
import dev.yasp.mastrfetcher.soapclient.StromerzeugerClient;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class MaStRFetcherServiceTest {
    @Mock
    private StromerzeugerClient stromerzeugerClient;
    @Mock
    private AnlagenBestandRepository anlagenBestandRepository;

    @InjectMocks
    private MaStRFetcherService maStRFetcherService;

    @Test
    void testFetchData() {
        //TODO erweitern um alle fachliche Logik, die in der Methode und den aufgerufenen privaten Methoden angewandt wird
        //  Prüfen ob das in einzelne Tests ausgegliedert werden kann, Methoden zerteilen oder je Test fachliche Teile der Methode testen
        int gemeindeschluessel = 12345678;
        //TODO anpassen sobald Mapping vorhanden, dann muss das getestet werden
        int plz = 48268;
        this.maStRFetcherService.fetchData(YearMonth.of(2020, 1), YearMonth.of(2020, 6), gemeindeschluessel, true);
        // Alles vorm Startmonat soll in einer Abfrage abgehandelt werden
        verify(stromerzeugerClient).requestPVEinheiten(plz, LocalDate.MIN, LocalDate.of(2020, 1, 1));
        // Verifizieren, dass automatisch die korrekten Monatsintervalle zwischen Start und Ende Parameter erstellt und die Daten abgefragt werden
        verify(stromerzeugerClient).requestPVEinheiten(plz, LocalDate.of(2019, 12, 31), LocalDate.of(2020, 2, 1));
        verify(stromerzeugerClient).requestPVEinheiten(plz, LocalDate.of(2020, 1, 31), LocalDate.of(2020, 3, 1));
        verify(stromerzeugerClient).requestPVEinheiten(plz, LocalDate.of(2020, 2, 29), LocalDate.of(2020, 4, 1));
        verify(stromerzeugerClient).requestPVEinheiten(plz, LocalDate.of(2020, 3, 31), LocalDate.of(2020, 5, 1));
        verify(stromerzeugerClient).requestPVEinheiten(plz, LocalDate.of(2020, 4, 30), LocalDate.of(2020, 6, 1));
        verify(stromerzeugerClient).requestPVEinheiten(plz, LocalDate.of(2020, 5, 31), LocalDate.of(2020, 7, 1));
        // Verifizieren, dass alle abgefragten Monate als aggregierte Objekte persistiert werden
        verify(anlagenBestandRepository).saveAll(argThat(list -> ((List<AnlagenBestand>) list).size() == 6));
    }
}
