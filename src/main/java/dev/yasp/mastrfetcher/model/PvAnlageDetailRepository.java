package dev.yasp.mastrfetcher.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PvAnlageDetailRepository extends JpaRepository<PvAnlageDetail, String> {

    void deleteByGemeindeschluessel(String gemeindeschluessel);
}
