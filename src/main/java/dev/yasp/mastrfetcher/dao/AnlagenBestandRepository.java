package dev.yasp.mastrfetcher.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.yasp.mastrfetcher.model.AnlagenBestand;

public interface AnlagenBestandRepository extends JpaRepository<AnlagenBestand, Integer> {
}
