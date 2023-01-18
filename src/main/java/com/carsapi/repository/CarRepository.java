package com.carsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carsapi.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
