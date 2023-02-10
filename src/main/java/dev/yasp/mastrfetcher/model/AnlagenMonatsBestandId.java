package dev.yasp.mastrfetcher.model;

import java.io.Serializable;
import java.util.Objects;

public class AnlagenMonatsBestandId implements Serializable {
    private int gemeindeSchluessel;
    private String monat;

    public AnlagenMonatsBestandId() {
    }

    public AnlagenMonatsBestandId(int gemeindeSchluessel, String monat) {
        this.gemeindeSchluessel = gemeindeSchluessel;
        this.monat = monat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnlagenMonatsBestandId that = (AnlagenMonatsBestandId) o;
        return gemeindeSchluessel == that.gemeindeSchluessel && Objects.equals(monat, that.monat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gemeindeSchluessel, monat);
    }
}
