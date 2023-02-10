package dev.yasp.mastrfetcher.soapclient;

import dev.yasp.mastrfetcher.model.EinheitDTO;
import dev.yasp.mastrfetcher.wsdl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class StromerzeugerClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(StromerzeugerClient.class);
    private String mastrWebserviceUrl, apiKey, marktakteurMastrNummer;

    public List<EinheitDTO> requestPVEinheiten(int postleitzahl, LocalDate after, LocalDate before) {
        GetGefilterteListeStromErzeugerResponse response = this.getGefilterteListeStromErzeugerResponse(
                EnergietraegerEnum.SOLARE_STRAHLUNGSENERGIE,
                String.valueOf(postleitzahl),
                after,
                before);

        if(response.getErgebniscode() != ErgebniscodeTyp.OK) {
            log.error("PV Einheiten Abfrage nicht erfolgreich, Ergebniscode: " + response.getErgebniscode());
            return Collections.emptyList();
        }
        return response.getEinheitens().stream()
                .map(einheit -> new EinheitDTO(einheit.getEinheitMastrNummer(), einheit.getBruttoleistung()))
                .toList();
    }

    private GetGefilterteListeStromErzeugerResponse getGefilterteListeStromErzeugerResponse(EnergietraegerEnum energietraeger, String postleitzahl, LocalDate after, LocalDate before) {
        GetGefilterteListeStromErzeugerRequest request = new GetGefilterteListeStromErzeugerRequest();
        /*
        Request Parameter
         */
        request.setApiKey(this.apiKey);
        request.setMarktakteurMastrNummer(this.marktakteurMastrNummer);
        request.setEnergietraeger(energietraeger);
        request.setPostleitzahl(postleitzahl);
        request.setEinheitBetriebsstatus(AnlagenBetriebsStatusEnum.IN_BETRIEB);
        try {
            if(after != LocalDate.MIN) {
                request.setInbetriebnahmedatumGroesser(DatatypeFactory.newInstance().newXMLGregorianCalendar(after.toString()));
            }
            if(before != LocalDate.MAX) {
                request.setInbetriebnahmedatumKleiner(DatatypeFactory.newInstance().newXMLGregorianCalendar(before.toString()));
            }
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
        return (GetGefilterteListeStromErzeugerResponse) getWebServiceTemplate()
                .marshalSendAndReceive(this.mastrWebserviceUrl + "Anlage", request,
                        new SoapActionCallback("GetGefilterteListeStromErzeuger"));
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
