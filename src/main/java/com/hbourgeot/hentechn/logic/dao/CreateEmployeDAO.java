package com.hbourgeot.hentechn.logic.dao;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateEmployeDAO {
  private String id;
  private String name;
  private String age;
  private Long country;
  private String lastName;
  private String role;
}
