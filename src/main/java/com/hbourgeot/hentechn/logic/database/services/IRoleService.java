package com.hbourgeot.hentechn.logic.database.services;

import java.util.Optional;

import com.hbourgeot.hentechn.logic.entities.Role;

public interface IRoleService {
  long count();

  boolean existsById(Long id);

  Iterable<Role> findAll();

  Optional<Role> findById(Long id);

  <S extends Role> S save(S entity);

}
