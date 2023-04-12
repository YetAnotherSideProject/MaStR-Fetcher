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

import jakarta.transaction.Transactional;

@Component
public class BiomasseAnlagenService {
    private static final Logger LOG = LoggerFactory.getLogger(BiomasseAnlagenService.class);
    //Injected by Spring Context via Constructor
    private final StromerzeugerClient stromerzeugerClient;
    private final AnlageDetailRepository anlageDetailRepository;

    public BiomasseAnlagenService(StromerzeugerClient stromerzeugerClient,
                                  AnlageDetailRepository anlageDetailRepository) {
        this.stromerzeugerClient = stromerzeugerClient;
        this.anlageDetailRepository = anlageDetailRepository;
    }

    @Transactional //TODO prüfen, ob auf dieser Ebene korrekt? Soll eigentlich nur DB Calls bündeln
    public void biomasseAnlagenAbfragenUndAufbereiten(String gemeindeschluessel) {
        LOG.info("Biomasse Anlagen abfragen & aufbereiten für Gemeindeschlüssel {}", gemeindeschluessel);
        //TODO Mapping Gemeindeschlüssel --> PLZ (1:n), solange kein Abfrageparameter gemeindeschluessel vorhanden
        var plz = "48268";

        var anlagen = this.stromerzeugerClient.gefilterteListeStromerzeuger(
                        new GetGefilterteListeStromErzeugerRequestBuilder()
                                .mitEnergietraeger(EnergietraegerEnum.BIOMASSE)
                                .mitBetriebsstatus(AnlagenBetriebsStatusEnum.IN_BETRIEB)
                                .mitPlz(plz))
                .stream()
                .map(einheit -> this.stromerzeugerClient.einheitBiomasse(einheit.getEinheitMastrNummer()))
                .map(dto -> new AnlageDetail(gemeindeschluessel, EnergietraegerEnum.BIOMASSE, dto))
                .toList();
        LOG.info("Detailinformationen für {} Biomasse-Anlagen abgefragt", anlagen.size());

        this.anlageDetailRepository.deleteByGemeindeschluesselAndEnergietraeger(
                gemeindeschluessel,
                EnergietraegerEnum.BIOMASSE);
        LOG.info("Vorherige Anlagendaten gelöscht");
        this.anlageDetailRepository.saveAll(anlagen);
        LOG.info("Anlagendetaildaten wurden persistiert");
    }
}
