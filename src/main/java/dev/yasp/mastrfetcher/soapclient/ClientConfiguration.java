package dev.yasp.mastrfetcher.soapclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.WebServiceMessageFactory;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

@Configuration
public class ClientConfiguration {

    private final Environment env;

    public ClientConfiguration(Environment env) {
        this.env = env;
    }

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in pom.xml
        marshaller.setContextPath("dev.yasp.mastrfetcher.webservice");
        return marshaller;
    }

    /*
    SOAP Version auf 12 (1.2) setzen, default ist 11 (1.1)
     */
    @Bean
    WebServiceMessageFactory messageFactory() {
        SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
        messageFactory.setSoapVersion(SoapVersion.SOAP_12);
        return messageFactory;
    }

    @Bean
    public StromerzeugerClient stromerzeugerClient(Jaxb2Marshaller marshaller, WebServiceMessageFactory messageFactory) {
        StromerzeugerClient client = new StromerzeugerClient();
        client.setApiKey(env.getProperty("mastr.webservice.apikey"));
        client.setMarktakteurMastrNummer(env.getProperty("mastr.marktakteurmastrnummer"));
        client.setMastrWebserviceUrl(env.getProperty("mastr.webservice.url"));
        client.setDefaultUri(env.getProperty("mastr.webservice.url"));
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        //Enforce SOAP 12
        client.setMessageFactory(messageFactory);
        return client;
    }
}
