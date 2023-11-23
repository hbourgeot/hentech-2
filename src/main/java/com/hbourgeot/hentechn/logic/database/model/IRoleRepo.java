package com.hbourgeot.hentechn.logic.database.model;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hbourgeot.hentechn.logic.entities.Role;

@Repository
public interface IRoleRepo extends CrudRepository<Role, Long> {

  @Override
  long count();

  @Override
  void delete(Role entity);

  @Override
  void deleteAll();

  @Override
  void deleteAll(Iterable<? extends Role> entities);

  @Override
  void deleteAllById(Iterable<? extends Long> ids);

  @Override
  void deleteById(Long id);

  @Override
  boolean existsById(Long id);

  @Override
  Iterable<Role> findAll();

  @Override
  Iterable<Role> findAllById(Iterable<Long> ids);

  @Override
  Optional<Role> findById(Long id);

  @Override
  <S extends Role> S save(S entity);

  @Override
  <S extends Role> Iterable<S> saveAll(Iterable<S> entities);
  
}
