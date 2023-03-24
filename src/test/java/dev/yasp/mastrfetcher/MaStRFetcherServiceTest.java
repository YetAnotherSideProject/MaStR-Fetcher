package dev.yasp.mastrfetcher;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import dev.yasp.mastrfetcher.dao.AnlagenBestandRepository;
import dev.yasp.mastrfetcher.model.AnlagenBestand;
import dev.yasp.mastrfetcher.soapclient.StromerzeugerClient;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MaStRFetcherServiceTest {
    @Mock
    private StromerzeugerClient stromerzeugerClient;
    @Mock
    private AnlagenBestandRepository anlagenBestandRepository;
    private MaStRFetcherService maStRFetcherService;

    @BeforeEach
    void setUp() {
        this.maStRFetcherService = new MaStRFetcherService(stromerzeugerClient, anlagenBestandRepository);
    }

    @Test
    void testFetchData() {
        int gemeindeschluessel = 12345678;
        //TODO anpassen sobald Mapping vorhanden, dann muss das getestet werden
        int plz = 48268;
        this.maStRFetcherService.fetchData(YearMonth.of(2020, 1), YearMonth.of(2020, 6), gemeindeschluessel, true);
        // Verify all before start month is fetched
        Mockito.verify(stromerzeugerClient).requestPVEinheiten(plz, LocalDate.MIN, LocalDate.of(2020, 1, 1));
        // Verify every month from start to end parameters are fetched
        Mockito.verify(stromerzeugerClient).requestPVEinheiten(plz, LocalDate.of(2019, 12, 31), LocalDate.of(2020, 2, 1));
        Mockito.verify(stromerzeugerClient).requestPVEinheiten(plz, LocalDate.of(2020, 1, 31), LocalDate.of(2020, 3, 1));
        Mockito.verify(stromerzeugerClient).requestPVEinheiten(plz, LocalDate.of(2020, 2, 29), LocalDate.of(2020, 4, 1));
        Mockito.verify(stromerzeugerClient).requestPVEinheiten(plz, LocalDate.of(2020, 3, 31), LocalDate.of(2020, 5, 1));
        Mockito.verify(stromerzeugerClient).requestPVEinheiten(plz, LocalDate.of(2020, 4, 30), LocalDate.of(2020, 6, 1));
        Mockito.verify(stromerzeugerClient).requestPVEinheiten(plz, LocalDate.of(2020, 5, 31), LocalDate.of(2020, 7, 1));
        // Verify Persistence calls for each YearMonth fetched before as AnlagenBestand aggregated data
        Mockito.verify(anlagenBestandRepository).saveAll(Mockito.argThat(list -> ((List<AnlagenBestand>) list).size() == 6));
    }
}
