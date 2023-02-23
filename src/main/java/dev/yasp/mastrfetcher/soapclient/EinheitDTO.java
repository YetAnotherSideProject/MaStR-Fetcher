package dev.yasp.mastrfetcher.soapclient;

import java.math.BigDecimal;

public record EinheitDTO(
        String mastrNummer,
        BigDecimal bruttoleistung) {
}
