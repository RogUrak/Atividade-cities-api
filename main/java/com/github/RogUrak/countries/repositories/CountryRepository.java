package com.github.RogUrak.countries.repositories;

import com.github.RogUrak.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
