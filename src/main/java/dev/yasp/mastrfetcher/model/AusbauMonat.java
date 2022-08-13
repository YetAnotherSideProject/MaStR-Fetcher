package dev.yasp.mastrfetcher.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "ausbaumonat", schema = "public")
@IdClass(AusbauMonatId.class)
public class AusbauMonat {

    @Id
    private int gemeindeSchluessel;
    @Id
    private String monat;
    private int anzahlAnlagen;
    private BigDecimal bruttoleistung;

    public AusbauMonat() {
    }

    public AusbauMonat(int gemeindeSchluessel, String monat, int anzahlAnlagen, BigDecimal bruttoleistung) {
        this.gemeindeSchluessel = gemeindeSchluessel;
        this.monat = monat;
        this.anzahlAnlagen = anzahlAnlagen;
        this.bruttoleistung = bruttoleistung;
    }

    public int getGemeindeSchluessel() {
        return gemeindeSchluessel;
    }

    public void setGemeindeSchluessel(int gemeindeSchluessel) {
        this.gemeindeSchluessel = gemeindeSchluessel;
    }

    public String getMonat() {
        return monat;
    }

    public void setMonat(String monat) {
        this.monat = monat;
    }

    public int getAnzahlAnlagen() {
        return anzahlAnlagen;
    }

    public void setAnzahlAnlagen(int anzahlAnlagen) {
        this.anzahlAnlagen = anzahlAnlagen;
    }

    public BigDecimal getBruttoleistung() {
        return bruttoleistung;
    }

    public void setBruttoleistung(BigDecimal bruttoleistung) {
        this.bruttoleistung = bruttoleistung;
    }
}

