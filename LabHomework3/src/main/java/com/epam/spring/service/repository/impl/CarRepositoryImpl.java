package com.epam.spring.service.repository.impl;

import com.epam.spring.controller.dto.CarClass;
import com.epam.spring.service.model.Car;
import com.epam.spring.service.repository.CarRepository;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class CarRepositoryImpl implements CarRepository {

    private Map<String, Car> cars = new HashMap<>();

    @Override
    public Car createCar(Car newCar) {
        String id = UUID.randomUUID().toString();
        newCar.setId(id);
        cars.put(id, newCar);
        return newCar;
    }

    @Override
    public Car updateCar(Car car, String id) {
        boolean isDeleted = cars.values().removeIf(c -> c.getId().equals(id));
        if (isDeleted) {
            cars.put(id, car);
        } else throw new RuntimeException("Car is not found");
        return car;
    }

    @Override
    public Set<Car> getCarByCarClass(CarClass carClass) {
        return cars.values().stream()
                .filter(c -> c.getCarClass().equals(carClass))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Car> getCars() {
        return new HashSet<>(cars.values());
    }

    @Override
    public void deleteCar(String id) {
        cars.values().removeIf(car -> car.getId().equals(id));
    }
}
