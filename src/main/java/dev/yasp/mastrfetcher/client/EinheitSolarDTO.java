package dev.yasp.mastrfetcher.client;

import java.math.BigDecimal;
import java.time.LocalDate;

public record EinheitSolarDTO(String einheitMastrNummer, BigDecimal laengengrad, BigDecimal breitengrad,
                              BigDecimal leistung, LocalDate inbetriebnahme) {
}
