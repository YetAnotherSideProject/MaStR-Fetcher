package dev.yasp.mastrfetcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import dev.yasp.mastrfetcher.service.PvAnlagenService;
import dev.yasp.mastrfetcher.service.WindAnlagenService;

import java.time.YearMonth;

@SpringBootApplication
public class MaStRFetcherCLI implements ApplicationRunner {
    private final CLIParser cliParser;
    private final PvAnlagenService pVAnlagenService;
    private static ConfigurableApplicationContext appCtx;
    private static final Logger LOG = LoggerFactory.getLogger(MaStRFetcherCLI.class);
    private final WindAnlagenService windAnlagenService;


    public MaStRFetcherCLI(CLIParser cliParser, PvAnlagenService pVAnlagenService,
                           WindAnlagenService windAnlagenService) {
        this.cliParser = cliParser;
        this.pVAnlagenService = pVAnlagenService;
        this.windAnlagenService = windAnlagenService;
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
        this.windAnlagenService.windAnlagenAbfragenUndAufbereiten(gemeindeschluessel);
    }
}
