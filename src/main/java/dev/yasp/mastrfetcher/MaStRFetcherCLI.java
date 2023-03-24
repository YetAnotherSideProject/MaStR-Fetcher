package dev.yasp.mastrfetcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.YearMonth;
import java.util.Set;

@SpringBootApplication
public class MaStRFetcherCLI implements ApplicationRunner {
    private final MaStRFetcherService fetchService;
    private static final Logger LOG = LoggerFactory.getLogger(MaStRFetcherCLI.class);

    public MaStRFetcherCLI(MaStRFetcherService fetchService) {
        this.fetchService = fetchService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MaStRFetcherCLI.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Parse & validate arguments
        Set<String> optionArgs = args.getOptionNames();
        if (!optionArgs.contains("gemeindeSchluessel")) {
            throw new IllegalArgumentException("Required Argument --gemeindeSchluessel=<gemeindeSchluessel> missing");
        }
        int gemeindeSchluessel = Integer.parseInt(args.getOptionValues("gemeindeSchluessel").get(0));
        LOG.info("Required Argument parsed gemeindeSchluessel: " + gemeindeSchluessel);

        boolean completeFetch = optionArgs.contains("completeFetch");
        LOG.info("Optional Argument parsed completeFetch: " + completeFetch);

        // TODO vorher fetch Gemeinde daten
        this.fetchService.fetchData(YearMonth.of(2010, 1), YearMonth.now().minusMonths(1), gemeindeSchluessel, completeFetch);
    }
}
