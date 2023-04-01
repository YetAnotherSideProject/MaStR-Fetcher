package dev.yasp.mastrfetcher.model;

import java.io.Serializable;
import java.time.YearMonth;
import java.util.Objects;

public class PvBestandMonatId implements Serializable {
    private String gemeindeschluessel;
    private YearMonth monat;

    public PvBestandMonatId() {
    }

    public PvBestandMonatId(String gemeindeschluessel, YearMonth monat) {
        this.gemeindeschluessel = gemeindeschluessel;
        this.monat = monat;
    }

    public String getGemeindeschluessel() {
        return gemeindeschluessel;
    }

    public YearMonth getMonat() {
        return monat;
    }

    public void setGemeindeschluessel(String gemeindeschluessel) {
        this.gemeindeschluessel = gemeindeschluessel;
    }

    public void setMonat(YearMonth monat) {
        this.monat = monat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PvBestandMonatId that = (PvBestandMonatId) o;
        return Objects.equals(gemeindeschluessel, that.gemeindeschluessel) && Objects.equals(monat,
                that.monat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gemeindeschluessel, monat);
    }
}
