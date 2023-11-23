package com.hbourgeot.hentechn.logic.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "roles")
public class Country {
  @Id
  private Long id;

  private String name;
}
