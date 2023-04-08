package dev.yasp.mastrfetcher.client;

import java.math.BigDecimal;
import java.time.LocalDate;

//TODO Solange im Frontend keine Energieart spezifischen Daten z.B. Rotodruchmesser/Höhe bei Wind benötigt werden
//  können alle Anlagen pauschal hiermit gemapped werden
public record EinheitDTO(String einheitMastrNummer, BigDecimal laengengrad, BigDecimal breitengrad,
                         BigDecimal leistung, LocalDate inbetriebnahme) {
}
