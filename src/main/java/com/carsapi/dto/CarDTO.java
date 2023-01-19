package com.carsapi.dto;

import java.util.Date;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;

public record CarDTO(
    @NotBlank String modelo,
    @NotBlank String fabricante,
    @Past Date dataFabricacao,
    @Positive @NotNull double valor,
    @Min(value = 1885) @Max(value = 2023) int anoModelo) {

}
