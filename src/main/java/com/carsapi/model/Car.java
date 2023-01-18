package com.carsapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Car {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column
  private String modelo;

  @Column
  private String fabricante;

  @Column
  private String dataFabricacao;

  @Column
  private double valor;

  @Column
  private int anoModelo;
}
