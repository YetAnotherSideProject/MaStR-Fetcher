package dev.yasp.mastrfetcher.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import dev.yasp.mastrfetcher.client.GetGefilterteListeStromErzeugerRequestBuilder;
import dev.yasp.mastrfetcher.client.StromerzeugerClient;
import dev.yasp.mastrfetcher.model.PvBestandMonat;
import dev.yasp.mastrfetcher.model.PvBestandMonatRepository;
import dev.yasp.mastrfetcher.webservice.AnlagenBetriebsStatusEnum;
import dev.yasp.mastrfetcher.webservice.EnergietraegerEnum;

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

    private final String testPlz = "48268";

    @Test
    void testPVAnlagenAbfragenUndAufbereiten() {
        //Testdaten
        var startMonat = YearMonth.of(2020, 1);
        var endMonat = YearMonth.of(2020, 6);
        pvAnlagenService.pvAnlagenAbfragenUndAufbereiten(this.testPlz, startMonat, endMonat);
        /*
        Verifizieren der korrekten Erzeugung der Monatsintervalle und Abfragen der Daten
        Testdaten geben 6 Monate als Intervalle vor, für die jeweils die Daten abgefragt werden sollten
        Zusätzlich wird der Zeitraum vor dem Startmonat als ein Intervall abgefragt
         */
        //TODO Parametersetzung im Request Builder verifizieren (Relevant sind die erzeugten Inbetriebnahme Parameter)
        //  Diesen Test refactoren, Anzahl ist aktuell unsicher da Weiterentwicklungen
        //verify(stromerzeugerClient, times(7)).gefilterteListeStromerzeuger(any());

        //Verifizieren, dass DB Persistierung für die erzeugten Monatsintervalle aufgerufen wird
        verify(pvBestandMonatRepository).saveAll(argThat(iterable -> ((List<PvBestandMonat>) iterable).size() == 6));
    }

    private GetGefilterteListeStromErzeugerRequestBuilder basisPVRequestBuilder() {
        return new GetGefilterteListeStromErzeugerRequestBuilder()
                .mitEnergietraeger(EnergietraegerEnum.SOLARE_STRAHLUNGSENERGIE)
                .mitBetriebsstatus(AnlagenBetriebsStatusEnum.IN_BETRIEB)
                .mitPlz(this.testPlz);
    }
}