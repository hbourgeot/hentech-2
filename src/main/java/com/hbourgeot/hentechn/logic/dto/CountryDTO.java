package com.hbourgeot.hentechn.logic.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class CountryDTO {
  @NotNull(message = "El ID no puede ser nulo")
  @PositiveOrZero(message = "El ID no puede ser negativo")
  private Long id;

  @NotNull(message = "El nombre no puede ser nulo")
  
  private String name;
}
