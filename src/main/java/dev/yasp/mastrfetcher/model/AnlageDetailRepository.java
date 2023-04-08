package dev.yasp.mastrfetcher.model;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.yasp.mastrfetcher.webservice.EnergietraegerEnum;

public interface AnlageDetailRepository extends JpaRepository<AnlageDetail, String> {

    void deleteByGemeindeschluesselAndEnergietraeger(String gemeindeschluessel, EnergietraegerEnum energietraeger);
}
