package dev.yasp.mastrfetcher.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import dev.yasp.mastrfetcher.client.GetGefilterteListeStromErzeugerRequestBuilder;
import dev.yasp.mastrfetcher.client.StromerzeugerClient;
import dev.yasp.mastrfetcher.model.AnlageDetail;
import dev.yasp.mastrfetcher.model.AnlageDetailRepository;
import dev.yasp.mastrfetcher.webservice.AnlagenBetriebsStatusEnum;
import dev.yasp.mastrfetcher.webservice.EnergietraegerEnum;

@Component
public class WindAnlagenService {

    private static final Logger LOG = LoggerFactory.getLogger(WindAnlagenService.class);
    //Injected by Spring Context via Constructor
    private final StromerzeugerClient stromerzeugerClient;
    private final AnlageDetailRepository anlageDetailRepository;

    public WindAnlagenService(StromerzeugerClient stromerzeugerClient, AnlageDetailRepository anlageDetailRepository) {
        this.stromerzeugerClient = stromerzeugerClient;
        this.anlageDetailRepository = anlageDetailRepository;
    }

    public void windAnlagenAbfragenUndAufbereiten(String gemeindeschluessel) {
        LOG.info("Wind Anlagen abfragen & aufbereiten für Gemeindeschlüssel {}", gemeindeschluessel);
        //TODO Mapping Gemeindeschlüssel --> PLZ (1:n), solange kein Abfrageparameter gemeindeschluessel vorhanden
        var plz = "48268";

        var anlagen = this.stromerzeugerClient.gefilterteListeStromerzeuger(
                        new GetGefilterteListeStromErzeugerRequestBuilder()
                                .mitEnergietraeger(EnergietraegerEnum.WIND)
                                .mitBetriebsstatus(AnlagenBetriebsStatusEnum.IN_BETRIEB)
                                .mitPlz(plz))
                .stream()
                .map(einheit -> this.stromerzeugerClient.einheitWind(einheit.getEinheitMastrNummer()))
                .map(dto -> new AnlageDetail(gemeindeschluessel, EnergietraegerEnum.WIND, dto))
                .toList();
        LOG.info("Detailinformationen für {} Wind-Anlagen abgefragt", anlagen.size());

        this.anlageDetailRepository.deleteByGemeindeschluesselAndEnergietraeger(
                gemeindeschluessel,
                EnergietraegerEnum.WIND);
        LOG.info("Vorherige Anlagendaten gelöscht");
        this.anlageDetailRepository.saveAll(anlagen);
        LOG.info("Anlagendetaildaten wurden persistiert");
    }
}
