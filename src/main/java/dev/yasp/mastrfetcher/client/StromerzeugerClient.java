package dev.yasp.mastrfetcher.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import dev.yasp.mastrfetcher.webservice.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class StromerzeugerClient extends WebServiceGatewaySupport {

    private static final Logger LOG = LoggerFactory.getLogger(StromerzeugerClient.class);
    private String mastrWebserviceUrl, apiKey, marktakteurMastrNummer;

    public List<Einheit> gefilterteListeStromerzeuger(GetGefilterteListeStromErzeugerRequestBuilder requestBuilder) {
        //Pflicht (Auth) Parameter aus Config setzen
        var request = requestBuilder.build();
        request.setApiKey(this.apiKey);
        request.setMarktakteurMastrNummer(this.marktakteurMastrNummer);

        //TODO Logging
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