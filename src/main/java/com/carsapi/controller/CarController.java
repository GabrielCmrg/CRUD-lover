package com.carsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.dto.CarDTO;
import com.carsapi.repository.CarRepository;

@RestController
@RequestMapping("/car")
public class CarController {

  @Autowired
  private CarRepository repository;

  @PostMapping
  public void create(@RequestBody CarDTO reqCarDTO) {
    System.out.println("Adicionado carro:");
    System.out.println(reqCarDTO.modelo());
    System.out.println(reqCarDTO.anoModelo());
  }
}
