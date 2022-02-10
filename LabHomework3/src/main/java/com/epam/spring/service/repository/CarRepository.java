package com.epam.spring.service.repository;

import com.epam.spring.controller.dto.CarClass;
import com.epam.spring.service.model.Car;

import java.util.Set;

public interface CarRepository {

    Car createCar(Car newCar);

    Car updateCar(Car car, String id);

    Set<Car> getCarByCarClass(CarClass carClass);

    Set<Car> getCars();

    void deleteCar(String id);
}
