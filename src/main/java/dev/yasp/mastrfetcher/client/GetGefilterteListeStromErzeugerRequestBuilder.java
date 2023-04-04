package dev.yasp.mastrfetcher.client;

import dev.yasp.mastrfetcher.webservice.AnlagenBetriebsStatusEnum;
import dev.yasp.mastrfetcher.webservice.EnergietraegerEnum;
import dev.yasp.mastrfetcher.webservice.GetGefilterteListeStromErzeugerRequest;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Builder für die optionalen (Filter) Parameter des {@link GetGefilterteListeStromErzeugerRequest}.
 * Pflicht Parameter "API-Key" & "MarktakteurMastrNummer" müssen bei Verwendung des request Objekt noch gesetzt werden
 */
public class GetGefilterteListeStromErzeugerRequestBuilder {
    private final GetGefilterteListeStromErzeugerRequest request;

    public GetGefilterteListeStromErzeugerRequestBuilder() {
        this.request = new GetGefilterteListeStromErzeugerRequest();
    }

    public GetGefilterteListeStromErzeugerRequest build() {
        return this.request;
    }

    public GetGefilterteListeStromErzeugerRequestBuilder mitEnergietraeger(EnergietraegerEnum energietraeger) {
        this.request.setEnergietraeger(energietraeger);
        return this;
    }

    public GetGefilterteListeStromErzeugerRequestBuilder mitPlz(String plz) {
        this.request.setPostleitzahl(plz);
        return this;
    }

    public GetGefilterteListeStromErzeugerRequestBuilder mitBetriebsstatus(AnlagenBetriebsStatusEnum betriebsstatus) {
        this.request.setEinheitBetriebsstatus(betriebsstatus);
        return this;
    }

    public GetGefilterteListeStromErzeugerRequestBuilder mitInbetriebnahmeGroesser(LocalDate inbetriebnahmeGroesser) {
        try {
            this.request.setInbetriebnahmedatumGroesser(
                    DatatypeFactory.newInstance().newXMLGregorianCalendar(inbetriebnahmeGroesser.toString()));
        } catch (DatatypeConfigurationException e) {
            //TODO
            throw new RuntimeException(e);
        }
        return this;
    }

    public GetGefilterteListeStromErzeugerRequestBuilder mitInbetriebnahmeKleiner(LocalDate inbetriebnahmeKleiner) {
        try {
            request.setInbetriebnahmedatumKleiner(
                    DatatypeFactory.newInstance().newXMLGregorianCalendar(inbetriebnahmeKleiner.toString()));
        } catch (DatatypeConfigurationException e) {
            //TODO
            throw new RuntimeException(e);
        }
        return this;
    }

    public GetGefilterteListeStromErzeugerRequestBuilder mitNettoleistungGroesser(BigDecimal nettoleistungGroesser) {
        request.setNettoleistungGroesser(nettoleistungGroesser);
        return this;
    }
}