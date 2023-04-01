package dev.yasp.mastrfetcher.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import dev.yasp.mastrfetcher.client.StromerzeugerClient;
import dev.yasp.mastrfetcher.model.PvBestandMonat;
import dev.yasp.mastrfetcher.model.PvBestandMonatRepository;
import dev.yasp.mastrfetcher.webservice.EnergietraegerEnum;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PvAnlagenServiceTest {

    @Mock
    private StromerzeugerClient stromerzeugerClient;
    @Mock
    private PvBestandMonatRepository pvBestandMonatRepository;
    @InjectMocks
    private PvAnlagenService pvAnlagenService;

    @Test
    void testPVAnlagenAbfragenUndAufbereiten() {
        //Testdaten
        var plz = "48268";
        var startMonat = YearMonth.of(2020, 1);
        var endMonat = YearMonth.of(2020, 6);
        pvAnlagenService.pvAnlagenAbfragenUndAufbereiten(plz, startMonat, endMonat);
        //Verifizieren der korrekten Erzeugung der Monatsintervalle und Abfragen der Daten
        //Testdaten geben 6 Monate als Intervalle vor
        verify(stromerzeugerClient).gefilterteListeStromerzeuger(EnergietraegerEnum.SOLARE_STRAHLUNGSENERGIE, plz,
                LocalDate.of(2019, 12, 31), LocalDate.of(2020, 2, 1));
        verify(stromerzeugerClient).gefilterteListeStromerzeuger(EnergietraegerEnum.SOLARE_STRAHLUNGSENERGIE, plz,
                LocalDate.of(2020, 1, 31), LocalDate.of(2020, 3, 1));
        //Februar 2020 hatte 29 Tage
        verify(stromerzeugerClient).gefilterteListeStromerzeuger(EnergietraegerEnum.SOLARE_STRAHLUNGSENERGIE, plz,
                LocalDate.of(2020, 2, 29), LocalDate.of(2020, 4, 1));
        verify(stromerzeugerClient).gefilterteListeStromerzeuger(EnergietraegerEnum.SOLARE_STRAHLUNGSENERGIE, plz,
                LocalDate.of(2020, 3, 31), LocalDate.of(2020, 5, 1));
        verify(stromerzeugerClient).gefilterteListeStromerzeuger(EnergietraegerEnum.SOLARE_STRAHLUNGSENERGIE, plz,
                LocalDate.of(2020, 4, 30), LocalDate.of(2020, 6, 1));
        verify(stromerzeugerClient).gefilterteListeStromerzeuger(EnergietraegerEnum.SOLARE_STRAHLUNGSENERGIE, plz,
                LocalDate.of(2020, 5, 31), LocalDate.of(2020, 7, 1));

        //Verifizieren, dass DB Persistierung für die erzeugten Monatsintervalle aufgerufen wird
        verify(pvBestandMonatRepository).saveAll(argThat(iterable -> ((List<PvBestandMonat>) iterable).size() == 6));
    }
}