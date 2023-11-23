package com.hbourgeot.hentechn.logic.database.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.hbourgeot.hentechn.logic.database.model.ICountryRepo;
import com.hbourgeot.hentechn.logic.entities.Country;

public class CountryServiceImpl implements ICountryService {

  @Autowired
  private ICountryRepo repo;

  @Override
  public long count() {
    return repo.count();
  }

  @Override
  public boolean existsById(Long id) {
    return repo.existsById(id);
  }

  @Override
  public List<Country> findAll() {
    return (List<Country>) repo.findAll();
  }

  @Override
  public Optional<Country> findById(Long id) {
    return repo.findById(id);
  }

  @Override
  public <S extends Country> S save(S entity) {
    return repo.save(entity);
  }
  
}
