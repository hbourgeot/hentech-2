package com.hbourgeot.hentechn.logic.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class Employee {
  @Id
  @Column(length = 10, unique = true)
  private String id;

  @Column(length = 50)
  private String name;

  private Long age;

  @ManyToOne
  private Country country;

  @Column(length = 50, name = "last_name")
  private String lastName;

  @ManyToOne
  private Role role;
}
