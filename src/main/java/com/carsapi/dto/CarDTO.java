package com.carsapi.dto;

import java.util.Date;

public record CarDTO(String modelo, String fabricante, Date dataFabricacao, double valor, int anoModelo) {

}
