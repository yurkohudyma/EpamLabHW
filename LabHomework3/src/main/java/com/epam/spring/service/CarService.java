package com.epam.spring.service;

import com.epam.spring.controller.dto.Carclass;
import com.epam.spring.service.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getCars();

    Car getCarById(int id);

    List<Car> findByCarclass(Carclass carclass);

    List<Car> getCarByModel(String model);




}