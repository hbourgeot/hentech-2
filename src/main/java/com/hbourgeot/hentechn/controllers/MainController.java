package com.hbourgeot.hentechn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/ping")
public class MainController {
  
  @GetMapping
  public String pong(){
    return "pong";
  }
}
