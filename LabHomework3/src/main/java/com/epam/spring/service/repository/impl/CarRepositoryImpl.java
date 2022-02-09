package com.epam.spring.service.repository.impl;

import com.epam.spring.controller.dto.CarClass;
import com.epam.spring.service.model.Car;
import com.epam.spring.service.repository.CarRepository;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
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
    public Set<Car> getCarByCarClass(CarClass carClass) {
        return cars.values().stream()
                .filter(c -> c.getCarClass().equals(carClass))
                .collect(Collectors.toSet());
    }
}
