package com.epam.spring.service;

import com.epam.spring.controller.dto.CarClass;
import com.epam.spring.controller.dto.CarDto;

import java.util.Set;

public interface CarService {

    CarDto createCar (CarClass carClass, CarDto carDto);

    CarDto updateCar(CarDto carDto, int carId);

    void deleteCar(int carId);

    Set<CarDto> getCarClassCars(CarClass carClass);

    Set<CarDto> getCars ();

    CarDto getCarById (int carId);



}
