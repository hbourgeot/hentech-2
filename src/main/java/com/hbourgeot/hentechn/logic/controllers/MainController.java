package com.hbourgeot.hentechn.logic.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.hbourgeot.hentechn.logic.entities.Country;
import com.hbourgeot.hentechn.logic.entities.Role;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController(value = "/")
public class MainController {
  
  @PostMapping(value="country")
  public Country createCountry(@RequestBody Country entity) {
    //TODO: process POST request

    return entity;
  }
  
  @PostMapping(value="role")
  public Role createRole(@RequestBody Role entity) {
      //TODO: process POST request
      
      return entity;
  }
}
