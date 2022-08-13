package dev.yasp.mastrfetcher.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.yasp.mastrfetcher.model.AusbauMonat;

public interface AusbauMonatRepository extends JpaRepository<AusbauMonat, Integer> {
}
