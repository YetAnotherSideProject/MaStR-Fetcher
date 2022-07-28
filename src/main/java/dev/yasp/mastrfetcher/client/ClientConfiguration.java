package dev.yasp.mastrfetcher.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.WebServiceMessageFactory;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

@Configuration
public class ClientConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in pom.xml
        marshaller.setContextPath("dev.yasp.mastrfetcher.wsdl");
        return marshaller;
    }

    /*
    SOAP Version auf 12 (1.2) setzen, default ist 11 (1.1)
     */
    @Bean
    WebServiceMessageFactory messageFactory()
    {
        SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
        messageFactory.setSoapVersion(SoapVersion.SOAP_12);
        return messageFactory;
    }

    @Bean
    public UhrzeitClient einheitClient(Jaxb2Marshaller marshaller, WebServiceMessageFactory messageFactory) {
        UhrzeitClient client = new UhrzeitClient();
        client.setDefaultUri("https://test.marktstammdatenregister.de/MaStRApi/");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        //Enforce SOAP 12
        client.setMessageFactory(messageFactory);
        return client;
    }
}
