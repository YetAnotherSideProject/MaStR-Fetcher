package dev.yasp.mastrfetcher.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Collections;
import java.util.List;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import dev.yasp.mastrfetcher.wsdl.*;

public class StromerzeugerClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(StromerzeugerClient.class);
    private String mastrWebserviceUrl, apiKey, marktakteurMastrNummer;

    /* //TODO
    //Große Städte haben mehrere PLZ, aber afaik immer eine lineare Range
    public List<Einheit> getPvEinheiten(int vonPostleitzahl, int bisPostleitzahl) {
        List<Einheit> pvEinheiten = new ArrayList<>();
        //TODO parallelisieren
        for(int i = vonPostleitzahl; i <= bisPostleitzahl; i++) {
            pvEinheiten.addAll(this.getPVEinheiten(i));
        }
        return pvEinheiten;
    }
     */

    public List<Einheit> getPVEinheiten(int postleitzahl, YearMonth monat, boolean inklVormonate, boolean groesser30kWp) {
        GetGefilterteListeStromErzeugerResponse response = this.getGefilterteListeStromErzeugerResponse(EnergietraegerEnum.SOLARE_STRAHLUNGSENERGIE, String.valueOf(postleitzahl), monat, inklVormonate, groesser30kWp);
        if (response.getErgebniscode() != ErgebniscodeTyp.OK) {
            log.error("PV Einheiten Abfrage nicht erfolgreich, Ergebniscode: " + response.getErgebniscode());
            return Collections.emptyList();
        }
        return response.getEinheitens();
    }

    private GetGefilterteListeStromErzeugerResponse getGefilterteListeStromErzeugerResponse(EnergietraegerEnum energietraeger, String postleitzahl, YearMonth monat, boolean inklVormonate, boolean groesser30kWp){
        GetGefilterteListeStromErzeugerRequest request = new GetGefilterteListeStromErzeugerRequest();
        /*
        Request Parameter
         */
        request.setApiKey(this.apiKey);
        request.setMarktakteurMastrNummer(this.marktakteurMastrNummer);
        request.setEnergietraeger(energietraeger);
        // TODO Gemeindeschlüssel Greven verwenden falls möglich
        // 05566012
        request.setPostleitzahl(postleitzahl);
        request.setEinheitBetriebsstatus(AnlagenBetriebsStatusEnum.IN_BETRIEB);
        //Setzen der Inbetriebnahmegrenzen. Nach letztem Tag des Vormonats, vor erstem Tag des Folgemonats
        //Wenn inklusive Vormonate nur before setzen
        try {
            if(!inklVormonate) {
                LocalDate after = monat.minusMonths(1).atEndOfMonth();
                request.setInbetriebnahmedatumGroesser(DatatypeFactory.newInstance().newXMLGregorianCalendar(after.toString()));
                log.info("Request Parameter Inbetriebnahme Nach: " + after);
            }
            LocalDate before = monat.plusMonths(1).atDay(1);
            request.setInbetriebnahmedatumKleiner(DatatypeFactory.newInstance().newXMLGregorianCalendar(before.toString()));
            log.info("Request Parameter Inbetriebnahme Vor: " + before);
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
        if(groesser30kWp) {
            request.setBruttoleistungGroesser(BigDecimal.valueOf(30));
        }

        log.info("Abfrage der Stromerzeugereinheiten, Energieträger: " + energietraeger + " für Postleitzahl " + postleitzahl);

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
