package dev.yasp.mastrfetcher.model;

import io.hypersistence.utils.hibernate.type.basic.YearMonthIntegerType;
import org.hibernate.annotations.Type;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.YearMonth;

@Entity
@Table(name = "pv_bestand_monat", schema = "public")
@IdClass(PvBestandMonatId.class)
public class PvBestandMonat {
    @Id
    private String gemeindeschluessel;
    @Id
    @Type(YearMonthIntegerType.class)
    // Kein Default SQL Mapping von YearMonth von JPA/Hibernate, Abbildung über Hypersistence Utils als Integer
    private YearMonth monat;
    private int anzahlAnlagen, zubauAnzahl;
    private BigDecimal bruttoleistung, zubauLeistung;

    public PvBestandMonat() {
        //TODO monat YearMonth.now()?
        this("", YearMonth.now(), 0, 0, BigDecimal.ZERO, BigDecimal.ZERO);
    }

    public PvBestandMonat(String gemeindeschluessel, YearMonth monat) {
        this(gemeindeschluessel, monat, 0, 0, BigDecimal.ZERO, BigDecimal.ZERO);
    }

    public PvBestandMonat(String gemeindeschluessel, YearMonth monat, int anzahlAnlagen, int zubauAnzahl,
                          BigDecimal bruttoleistung, BigDecimal zubauLeistung) {
        this.gemeindeschluessel = gemeindeschluessel;
        this.monat = monat;
        this.anzahlAnlagen = anzahlAnlagen;
        this.zubauAnzahl = zubauAnzahl;
        this.bruttoleistung = bruttoleistung;
        this.zubauLeistung = zubauLeistung;
    }

    public void setGemeindeschluessel(String gemeindeschluessel) {
        this.gemeindeschluessel = gemeindeschluessel;
    }

    public void setMonat(YearMonth monat) {
        this.monat = monat;
    }

    public void setAnzahlAnlagen(int anzahlAnlagen) {
        this.anzahlAnlagen = anzahlAnlagen;
    }

    public int getAnzahlAnlagen() {
        return anzahlAnlagen;
    }

    public void setZubauAnzahl(int zubauAnzahl) {
        this.zubauAnzahl = zubauAnzahl;
    }

    public int getZubauAnzahl() {
        return zubauAnzahl;
    }

    public void setBruttoleistung(BigDecimal bruttoleistung) {
        this.bruttoleistung = bruttoleistung;
    }

    public BigDecimal getBruttoleistung() {
        return bruttoleistung;
    }

    public void setZubauLeistung(BigDecimal zubauLeistung) {
        this.zubauLeistung = zubauLeistung;
    }

    public BigDecimal getZubauLeistung() {
        return zubauLeistung;
    }
}
