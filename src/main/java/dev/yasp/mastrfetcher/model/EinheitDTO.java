package dev.yasp.mastrfetcher.model;

import java.math.BigDecimal;

public record EinheitDTO(
        String mastrNummer,
        BigDecimal bruttoleistung
) {
}
