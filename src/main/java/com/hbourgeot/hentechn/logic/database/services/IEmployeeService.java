package com.hbourgeot.hentechn.logic.database.services;

import java.util.Optional;

import com.hbourgeot.hentechn.logic.entities.Employee;

public interface IEmployeeService {
  long count();

  void delete(Employee entity);

  void deleteById(String id);

  boolean existsById(String id);

  Iterable<Employee> findAll();

  Optional<Employee> findById(String id);

  <S extends Employee> S save(S entity);

}
