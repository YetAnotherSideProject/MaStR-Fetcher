package dev.yasp.mastrfetcher.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "gemeinde", schema = "public")
public class Gemeinde {
    @Id
    private int schluessel;
    private String name;
    private int einwohner;
    private LocalDate einwohnerStand;
    private int anzahlAnlagen;
    private BigDecimal bruttoleistung;
    private LocalDate stand;

    public Gemeinde() {
    }

    public Gemeinde(int schluessel, String name, int einwohner, LocalDate einwohnerStand, int anzahlAnlagen, BigDecimal bruttoleistung, LocalDate stand) {
        this.schluessel = schluessel;
        this.name = name;
        this.einwohner = einwohner;
        this.einwohnerStand = einwohnerStand;
        this.anzahlAnlagen = anzahlAnlagen;
        this.bruttoleistung = bruttoleistung;
        this.stand = stand;
    }

    public int getSchluessel() {
        return schluessel;
    }

    public void setSchluessel(int schluessel) {
        this.schluessel = schluessel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEinwohner() {
        return einwohner;
    }

    public void setEinwohner(int einwohner) {
        this.einwohner = einwohner;
    }

    public LocalDate getEinwohnerStand() {
        return einwohnerStand;
    }

    public void setEinwohnerStand(LocalDate einwohnerStand) {
        this.einwohnerStand = einwohnerStand;
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

    public LocalDate getStand() {
        return stand;
    }

    public void setStand(LocalDate stand) {
        this.stand = stand;
    }
}
