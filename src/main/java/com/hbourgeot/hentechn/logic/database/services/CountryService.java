package com.hbourgeot.hentechn.logic.database.services;

import java.util.Optional;

import com.hbourgeot.hentechn.logic.entities.Country;

public interface CountryService {
  long count();

  boolean existsById(Long id);

  Iterable<Country> findAll();

  Optional<Country> findById(Long id);

  <S extends Country> S save(S entity);
}
