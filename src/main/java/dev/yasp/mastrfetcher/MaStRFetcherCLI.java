package dev.yasp.mastrfetcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import dev.yasp.mastrfetcher.service.PvAnlagenService;

import java.time.YearMonth;

@SpringBootApplication
public class MaStRFetcherCLI implements ApplicationRunner {
    private final CLIParser cliParser;
    private final PvAnlagenService pVAnlagenService;
    private static ConfigurableApplicationContext appCtx;
    private static final Logger LOG = LoggerFactory.getLogger(MaStRFetcherCLI.class);


    public MaStRFetcherCLI(CLIParser cliParser, PvAnlagenService pVAnlagenService) {
        this.cliParser = cliParser;
        this.pVAnlagenService = pVAnlagenService;
    }

    public static void main(String[] args) {
        appCtx = SpringApplication.run(MaStRFetcherCLI.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Parse & validate arguments
        var gemeindeschluesselArg = this.cliParser.parseCLIArgs(args);
        String gemeindeschluessel = "";
        // Wenn kein Gemeindeschlüssel übergeben wurde (z.B. nur help Aufruf) Programm beenden
        if (gemeindeschluesselArg.isEmpty()) {
            LOG.info("Programm wird kontrolliert gewollt beendet");
            appCtx.close();
        } else {
            gemeindeschluessel = gemeindeschluesselArg.get();
        }

        LOG.info("Fetcher App startet für Gemeindeschlüssel {}", gemeindeschluessel);
        //TODO Parameter
        this.pVAnlagenService.pvAnlagenAbfragenUndAufbereiten(gemeindeschluessel, YearMonth.of(2010, 1),
                YearMonth.now().minusMonths(1));
    }
}
