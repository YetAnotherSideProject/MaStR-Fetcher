package dev.yasp.mastrfetcher.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import dev.yasp.mastrfetcher.webservice.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class StromerzeugerClient extends WebServiceGatewaySupport {

    private static final Logger LOG = LoggerFactory.getLogger(StromerzeugerClient.class);
    private String mastrWebserviceUrl, apiKey, marktakteurMastrNummer;

    public List<Einheit> gefilterteListeStromerzeuger(EnergietraegerEnum energietraeger, String plz,
                                                      LocalDate inbetriebnahmeNach, LocalDate inbetriebnahmeVor) {
        LOG.info(
                "Einheiten abfragen mit Parametern Energieträger={}, Postleitzahl={}, Inbetriebnahme nach {}, Inbetriebnahme vor {}",
                energietraeger, plz, inbetriebnahmeNach, inbetriebnahmeVor);
        GetGefilterteListeStromErzeugerRequest request = new GetGefilterteListeStromErzeugerRequest();
        /*
        Setzen der Request Parameter
        //TODO Weitere notwendige Attribute parametrisieren/in eigenes Konfig Objekt ausgliedern
         */
        request.setApiKey(this.apiKey);
        request.setMarktakteurMastrNummer(this.marktakteurMastrNummer);
        request.setEinheitBetriebsstatus(AnlagenBetriebsStatusEnum.IN_BETRIEB);
        request.setEnergietraeger(energietraeger);
        request.setPostleitzahl(plz);
        try {
            if (inbetriebnahmeNach != LocalDate.MIN) {
                request.setInbetriebnahmedatumGroesser(
                        DatatypeFactory.newInstance().newXMLGregorianCalendar(inbetriebnahmeNach.toString()));
            }
            if (inbetriebnahmeVor != LocalDate.MAX) {
                request.setInbetriebnahmedatumKleiner(
                        DatatypeFactory.newInstance().newXMLGregorianCalendar(inbetriebnahmeVor.toString()));
            }
        } catch (DatatypeConfigurationException e) {
            LOG.error("Fehler beim konvertieren der Inbetriebnahmedatum Parameter in Request Attribute");
            //TODO korrektes Exception Logging?
            LOG.error(e.getMessage());
            //TODO Runtime Exception?
            throw new RuntimeException(e);
        }

        var response = (GetGefilterteListeStromErzeugerResponse) getWebServiceTemplate().marshalSendAndReceive(
                this.mastrWebserviceUrl + "Anlage", request, new SoapActionCallback("GetGefilterteListeStromErzeuger"));

        if (response.getErgebniscode() != ErgebniscodeTyp.OK) {
            LOG.error("Einheiten Abfrage nicht erfolgreich, Ergebniscode: " + response.getErgebniscode());
            return Collections.emptyList();
        }

        return response.getEinheitens();
    }

    public void setMastrWebserviceUrl(String mastrWebserviceUrl) {
        this.mastrWebserviceUrl = mastrWebserviceUrl;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void setMarktakteurMastrNummer(String marktakteurMastrNummer) {
        this.marktakteurMastrNummer = marktakteurMastrNummer;
    }
}
