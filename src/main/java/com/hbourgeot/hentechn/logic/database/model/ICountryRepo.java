package com.hbourgeot.hentechn.logic.database.model;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.hbourgeot.hentechn.logic.entities.Country;

public interface ICountryRepo extends CrudRepository<Country, Long> {

  @Override
  long count();

  @Override
  void delete(Country entity);

  @Override
  void deleteAll();

  @Override
  void deleteAll(Iterable<? extends Country> entities);

  @Override
  void deleteAllById(Iterable<? extends Long> ids);

  @Override
  void deleteById(Long id);

  @Override
  boolean existsById(Long id);

  @Override
  Iterable<Country> findAll();

  @Override
  Iterable<Country> findAllById(Iterable<Long> ids);

  @Override
  Optional<Country> findById(Long id);

  @Override
  <S extends Country> S save(S entity);

  @Override
  <S extends Country> Iterable<S> saveAll(Iterable<S> entities);
  
}
