package dev.yasp.mastrfetcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CLIParser {

    private static final Logger LOG = LoggerFactory.getLogger(CLIParser.class);

    /**
     * @param args Übergebene Argumente an den Programmaufruf
     * @return 8-stelliger numerischer Gemeindeschlüssel oder Null
     */
    public Optional<String> parseCLIArgs(ApplicationArguments args) {
        // Keine Parameter
        if (args.getNonOptionArgs().isEmpty() && !args.containsOption("help") && !args.containsOption("h")) {
            LOG.error("Kein Aufrufparameter erkannt, Programm beendet");
            throw new IllegalArgumentException("Programm erwartet Aufrufparameter, Hilfe mit --help");
        }
        // Hilfe
        if (args.containsOption("help") || args.containsOption("h")) {
            System.out.println(
                    "Erwartet wird als Parameter der 8 stellige numerische Gemeindeschlüssel zum abrufen der Daten");
            LOG.info("Hilfe zur Verwendung angefragt & angezeigt");
            return Optional.empty();
        }
        // Parameter parsen testen auf Numeric und genau 8 Stellen
        String parameter = args.getNonOptionArgs().get(0);
        try {
            Integer.parseInt(parameter);
        } catch (Exception e) {
            LOG.error("Parameter als nicht numerisch erkannt", e);
            throw new IllegalArgumentException(
                    "Erster Parameter konnte nicht verarbeitet werden, erwartet wird ein numerischer Wert");
        }
        if (parameter.length() != 8) {
            LOG.error("Parameter nicht in der geforderten Form genau 8 Ziffern erkannt");
            throw new IllegalArgumentException(
                    "Parameter wird mit genau 8 numerischen Stellen erwartet");
        }

        return Optional.of(parameter);
    }
}
