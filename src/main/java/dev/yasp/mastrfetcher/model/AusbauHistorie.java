package dev.yasp.mastrfetcher.model;

import java.math.BigDecimal;
import java.time.YearMonth;

public record AusbauHistorie(
        int gemeindeSchluessel,
        YearMonth monat,
        int anzahlAnlagen,
        BigDecimal bruttoleistung
) {
}
