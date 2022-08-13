package dev.yasp.mastrfetcher.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Gemeinde(
        int gemeindeSchluessel,
        String gemeindeName,
        int einwohner,
        LocalDate einwohnerStand,
        int anzahlAnlagen,
        BigDecimal bruttoleistung,
        LocalDate stand) {
}
