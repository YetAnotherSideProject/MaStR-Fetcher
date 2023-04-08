package dev.yasp.mastrfetcher.model;

import dev.yasp.mastrfetcher.client.EinheitDTO;
import dev.yasp.mastrfetcher.webservice.EnergietraegerEnum;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "anlage_detail", schema = "public")
public class AnlageDetail {

    //TODO zus. zu Primary Key und gemeindeschluessel sollten breiten/Längengrad für Map Anzeige ausreichen und Info im Popup: Leistung und Inbetriebnahmedatum
    @Id
    private String einheitMastrNummer;
    @Enumerated(EnumType.STRING)
    private EnergietraegerEnum energietraeger;
    private String gemeindeschluessel;//TODO Index auf diese beiden Felder auch anlegen, da Abfragen immer darüber gefiltert werden sollten
    //TODO prüfen wie Abbildung der Geo Daten im Backend (Supabase PostgreSQL) besser abgebildet werden kann
    private BigDecimal laengengrad, breitengrad, leistung;
    private LocalDate inbetriebnahme;

    public AnlageDetail() {
    }

    //TODO eventell als static Methode in EinheitSolarDTO, dann gäbe es hier keine direkte Abhängigkeit zu der Klasse
    public AnlageDetail(String gemeindeschluessel, EnergietraegerEnum energietraeger, EinheitDTO dto) {
        this(gemeindeschluessel, dto.einheitMastrNummer(), energietraeger,
                dto.laengengrad(), dto.breitengrad(), dto.leistung(),
                dto.inbetriebnahme());
    }

    public AnlageDetail(String gemeindeschluessel, String einheitMastrNummer, EnergietraegerEnum energietraeger,
                        BigDecimal laengengrad,
                        BigDecimal breitengrad, BigDecimal leistung, LocalDate inbetriebnahme) {
        this.gemeindeschluessel = gemeindeschluessel;
        this.einheitMastrNummer = einheitMastrNummer;
        this.energietraeger = energietraeger;
        this.laengengrad = laengengrad;
        this.breitengrad = breitengrad;
        this.leistung = leistung;
        this.inbetriebnahme = inbetriebnahme;
    }

    public void setGemeindeschluessel(String gemeindeschluessel) {
        this.gemeindeschluessel = gemeindeschluessel;
    }

    public void setEinheitMastrNummer(String einheitMastrNummer) {
        this.einheitMastrNummer = einheitMastrNummer;
    }

    public void setEnergietraeger(EnergietraegerEnum energietraeger) {
        this.energietraeger = energietraeger;
    }

    public void setLaengengrad(BigDecimal laengengrad) {
        this.laengengrad = laengengrad;
    }

    public void setBreitengrad(BigDecimal breitengrad) {
        this.breitengrad = breitengrad;
    }

    public void setLeistung(BigDecimal leistung) {
        this.leistung = leistung;
    }

    public void setInbetriebnahme(LocalDate inbetriebnahme) {
        this.inbetriebnahme = inbetriebnahme;
    }

    public String getGemeindeschluessel() {
        return gemeindeschluessel;
    }

    public String getEinheitMastrNummer() {
        return einheitMastrNummer;
    }

    public EnergietraegerEnum getEnergietraeger() {
        return energietraeger;
    }

    public BigDecimal getLaengengrad() {
        return laengengrad;
    }

    public BigDecimal getBreitengrad() {
        return breitengrad;
    }

    public BigDecimal getLeistung() {
        return leistung;
    }

    public LocalDate getInbetriebnahme() {
        return inbetriebnahme;
    }
}
