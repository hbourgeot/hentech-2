package com.hbourgeot.hentechn.logic.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateEmployeDTO {
  private String id;
  private String name;
  private String age;
  private Long country;
  private String lastName;
  private String role;
}
