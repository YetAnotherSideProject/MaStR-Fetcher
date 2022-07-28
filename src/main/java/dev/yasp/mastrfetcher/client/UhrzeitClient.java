package dev.yasp.mastrfetcher.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import dev.yasp.mastrfetcher.wsdl.GetLokaleUhrzeitMitAuthentifizierungRequest;
import dev.yasp.mastrfetcher.wsdl.GetLokaleUhrzeitMitAuthentifizierungResponse;
import dev.yasp.mastrfetcher.wsdl.GetLokaleUhrzeitRequest;
import dev.yasp.mastrfetcher.wsdl.GetLokaleUhrzeitResponse;

public class UhrzeitClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(UhrzeitClient.class);

    public GetLokaleUhrzeitResponse getLokaleUhrzeitAntwort() {
        GetLokaleUhrzeitRequest request = new GetLokaleUhrzeitRequest();
        //Keine Parameter
        log.info("Abfrage der authentifizierungslosen lokalen Uhrzeit");

        GetLokaleUhrzeitResponse response = (GetLokaleUhrzeitResponse) getWebServiceTemplate()
                .marshalSendAndReceive("https://test.marktstammdatenregister.de/MaStRApi/Api.svc/Soap12/Common", request,
                        new SoapActionCallback("GetLokaleUhrzeit"));

        return response;
    }


    public GetLokaleUhrzeitMitAuthentifizierungResponse getLokaleUhrzeitMitAuthentifizierungAntwort() {
        GetLokaleUhrzeitMitAuthentifizierungRequest request = new GetLokaleUhrzeitMitAuthentifizierungRequest();
        request.setApiKey(""); //TODO

        log.info("Abfrage der authentifizierten lokalen Uhrzeit");

        GetLokaleUhrzeitMitAuthentifizierungResponse response = (GetLokaleUhrzeitMitAuthentifizierungResponse) getWebServiceTemplate()
                .marshalSendAndReceive("https://test.marktstammdatenregister.de/MaStRApi/Api.svc/Soap12/Common", request,
                        new SoapActionCallback("GetLokaleUhrzeitMitAuthentifizierung"));

        return response;
    }
}
