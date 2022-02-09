package com.epam.spring.service.impl;

import com.epam.spring.controller.dto.CarClass;
import com.epam.spring.controller.dto.CarDto;
import com.epam.spring.service.CarService;
import com.epam.spring.service.mapper.CarMapper;
import com.epam.spring.service.model.Car;
import com.epam.spring.service.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Set;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepo;

    @Override
    public CarDto createCar(CarClass carClass, CarDto carDto) {
        log.info("createCar by carclass {}", carClass);
        Car newCar = CarMapper.INSTANCE.mapCar(carDto);
        newCar.setCarClass(carClass);
        newCar = carRepo.createCar(newCar);
        return CarMapper.INSTANCE.mapCarDto(newCar);
    }

    @Override
    public CarDto updateCar(CarDto carDto, int carId) {
        log.info("updateCar by id {}", carId);
        return null;
    }

    @Override
    public void deleteCar(int carId) {
        /** delete a car */
    }

    @Override
    public Set<CarDto> getCarClassCars(CarClass carClass) {
        Set<Car> cars = carRepo.getCarByCarClass(carClass);
        return CarMapper.INSTANCE.mapCarDtos(cars);
    }

    @Override
    public Set<CarDto> getCars() {
        Set<Car> cars = carRepo.getCars();
        return CarMapper.INSTANCE.mapCarDtos(cars);
    }

    @Override
    public CarDto getCarById(int carId) {
        return null;
    }
}
