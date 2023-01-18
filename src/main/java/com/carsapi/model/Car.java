package com.carsapi.model;

import com.carsapi.dto.CarDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Car {

  public Car(CarDTO data) {
    this.modelo = data.modelo();
    this.fabricante = data.fabricante();
    this.dataFabricacao = data.dataFabricacao();
    this.valor = data.valor();
    this.anoModelo = data.anoModelo();
  }

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
