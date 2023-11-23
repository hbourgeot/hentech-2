package com.hbourgeot.hentechn.logic.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.hbourgeot.hentechn.logic.database.services.CountryService;
import com.hbourgeot.hentechn.logic.entities.Country;
import com.hbourgeot.hentechn.logic.entities.Role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController(value = "/")
public class MainController {
  
  @Autowired
  private CountryService countryService;

  @PostMapping(value="country")
  public Country createCountry(@RequestBody Country entity) {
    return countryService.save(entity);
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
