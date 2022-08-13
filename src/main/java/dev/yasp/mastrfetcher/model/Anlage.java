package dev.yasp.mastrfetcher.model;

import java.math.BigDecimal;

public record Anlage(
        int gemeindeSchluessel,
        String einheitMastrNummer,
        String standort,
        BigDecimal bruttoleistung
) {
}
