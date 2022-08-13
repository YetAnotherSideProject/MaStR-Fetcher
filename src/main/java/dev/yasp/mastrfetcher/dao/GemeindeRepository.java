package dev.yasp.mastrfetcher.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.yasp.mastrfetcher.model.Gemeinde;

public interface GemeindeRepository extends JpaRepository<Gemeinde, Integer> {
}
