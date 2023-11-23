package com.hbourgeot.hentechn.logic.database.model;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.hbourgeot.hentechn.logic.entities.Employee;

public interface IEmployeeRepo extends CrudRepository<Employee, String>{

  @Override
  long count();

  @Override
  void delete(Employee entity);

  @Override
  void deleteAll();

  @Override
  void deleteAll(Iterable<? extends Employee> entities);

  @Override
  void deleteAllById(Iterable<? extends String> ids);

  @Override
  void deleteById(String id);

  @Override
  boolean existsById(String id);

  @Override
  Iterable<Employee> findAll();

  @Override
  Iterable<Employee> findAllById(Iterable<String> ids);

  @Override
  Optional<Employee> findById(String id);

  @Override
  <S extends Employee> S save(S entity);

  @Override
  <S extends Employee> Iterable<S> saveAll(Iterable<S> entities);
  
}
