package dev.yasp.mastrfetcher.model;

import dev.yasp.mastrfetcher.client.EinheitSolarDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "pv_anlage_detail", schema = "public")
public class PvAnlageDetail {

    //TODO zus. zu Primary Key und gemeindeschluessel sollten breiten/Längengrad für Map Anzeige ausreichen und Info im Popup: Leistung und Inbetriebnahmedatum
    @Id
    private String einheitMastrNummer;
    private String gemeindeschluessel;//TODO Index auf Gemeindeschlüssel, da Abfragen immer darüber gefiltert werden sollten
    //TODO prüfen wie Abbildung der Geo Daten im Backend (Supabase PostgreSQL) besser abgebildet werden kann
    private BigDecimal laengengrad, breitengrad, leistung;
    private LocalDate inbetriebnahme;

    public PvAnlageDetail() {
    }

    //TODO eventell als static Methode in EinheitSolarDTO, dann gäbe es hier keine direkte Abhängigkeit zu der Klasse
    public PvAnlageDetail(String gemeindeschluessel, EinheitSolarDTO dto) {
        this(gemeindeschluessel, dto.einheitMastrNummer(), dto.laengengrad(), dto.breitengrad(), dto.leistung(),
                dto.inbetriebnahme());
    }

    public PvAnlageDetail(String gemeindeschluessel, String einheitMastrNummer, BigDecimal laengengrad,
                          BigDecimal breitengrad, BigDecimal leistung, LocalDate inbetriebnahme) {
        this.gemeindeschluessel = gemeindeschluessel;
        this.einheitMastrNummer = einheitMastrNummer;
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
