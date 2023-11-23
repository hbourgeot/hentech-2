package com.hbourgeot.hentechn.logic.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.hbourgeot.hentechn.infraestructure.config.ApiResponse;
import com.hbourgeot.hentechn.infraestructure.config.ResponseHandler;
import com.hbourgeot.hentechn.logic.database.services.CountryService;
import com.hbourgeot.hentechn.logic.dto.CountryDTO;
import com.hbourgeot.hentechn.logic.entities.Country;
import com.hbourgeot.hentechn.logic.entities.Role;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController(value = "/")
public class MainController {
  
  @Autowired
  private CountryService countryService;

  @PostMapping(value="country")
  public ResponseEntity<ApiResponse> createCountry(@Valid @RequestBody CountryDTO entity) {
    try {
      Country country = new Country();
      country.setId();
      
      countryService.save(entity);
      return ResponseHandler.handleSuccess(country);
    } catch (Exception e) {
      return ResponseHandler.handleServerError(e, 500);
    }

  }

  @GetMapping(value = "country")
  public List<Country> getAllCountries() {
    return (List<Country>) countryService.findAll();
  }
  
  @PostMapping(value="role")
  public Role createRole(@RequestBody Role entity) {
      //TODO: process POST request
      
      return entity;
  }
}
