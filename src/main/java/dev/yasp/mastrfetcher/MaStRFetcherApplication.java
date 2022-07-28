package dev.yasp.mastrfetcher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.yasp.mastrfetcher.client.UhrzeitClient;
import dev.yasp.mastrfetcher.wsdl.GetLokaleUhrzeitMitAuthentifizierungResponse;
import dev.yasp.mastrfetcher.wsdl.GetLokaleUhrzeitResponse;

@SpringBootApplication
public class MaStRFetcherApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaStRFetcherApplication.class, args);
    }

    @Bean
    CommandLineRunner fetcher(UhrzeitClient uhrzeitClient) {
        return args -> {
            GetLokaleUhrzeitResponse response = uhrzeitClient.getLokaleUhrzeitAntwort();
            System.out.println(response.getLokaleUhrzeit());

            GetLokaleUhrzeitMitAuthentifizierungResponse responseAuthed = uhrzeitClient.getLokaleUhrzeitMitAuthentifizierungAntwort();
            System.out.println(responseAuthed.getLokaleUhrzeitMitAuthentifizierung());
        };
    }
}
