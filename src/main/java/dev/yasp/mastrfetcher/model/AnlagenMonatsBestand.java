package dev.yasp.mastrfetcher.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "anlagenmonatsbestand", schema = "public")
@IdClass(AnlagenMonatsBestandId.class)
public class AnlagenMonatsBestand {
    @Id
    private int gemeindeSchluessel;
    @Id
    private String monat;

    private int anzahlAnlagen, zubauAnzahl;
    private BigDecimal bruttoleistung, zubauLeistung;

    public AnlagenMonatsBestand() {
        this.anzahlAnlagen = 0;
        this.zubauAnzahl = 0;
        this.bruttoleistung = BigDecimal.ZERO;
        this.zubauLeistung = BigDecimal.ZERO;
    }

    public AnlagenMonatsBestand(int gemeindeSchluessel, String monat, int anzahlAnlagen, int zubauAnzahl, BigDecimal bruttoleistung, BigDecimal zubauLeistung) {
        this.gemeindeSchluessel = gemeindeSchluessel;
        this.monat = monat;
        this.anzahlAnlagen = anzahlAnlagen;
        this.zubauAnzahl = zubauAnzahl;
        this.bruttoleistung = bruttoleistung;
        this.zubauLeistung = zubauLeistung;
    }

    public void setGemeindeSchluessel(int gemeindeSchluessel) {
        this.gemeindeSchluessel = gemeindeSchluessel;
    }

    public void setMonat(String monat) {
        this.monat = monat;
    }

    public void setAnzahlAnlagen(int anzahlAnlagen) {
        this.anzahlAnlagen = anzahlAnlagen;
    }

    public void setZubauAnzahl(int zubauAnzahl) {
        this.zubauAnzahl = zubauAnzahl;
    }

    public void setBruttoleistung(BigDecimal bruttoleistung) {
        this.bruttoleistung = bruttoleistung;
    }

    public void setZubauLeistung(BigDecimal zubauLeistung) {
        this.zubauLeistung = zubauLeistung;
    }

    public int getGemeindeSchluessel() {
        return gemeindeSchluessel;
    }

    public String getMonat() {
        return monat;
    }

    public int getAnzahlAnlagen() {
        return anzahlAnlagen;
    }

    public int getZubauAnzahl() {
        return zubauAnzahl;
    }

    public BigDecimal getBruttoleistung() {
        return bruttoleistung;
    }

    public BigDecimal getZubauLeistung() {
        return zubauLeistung;
    }
}
