package com.epam.spring.service.impl;

import com.epam.spring.controller.dto.Carclass;
import com.epam.spring.service.CarService;
import com.epam.spring.service.exception.EntityNotFoundException;
import com.epam.spring.service.model.Car;
import com.epam.spring.service.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor

public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Override
    public Car getCarById(int id) {
        log.info("getCar by id {}", id);
        if (carRepository.existsById(id)) {
            return carRepository.findById(id);
        }
        throw new EntityNotFoundException("Car not found");
    }

    @Override
    public List<Car> getCars() {
        log.info("get All Cars sorted by model");
        Sort sort = Sort.by("model");
        return carRepository.findAll(sort);
    }

    @Override
    public List<Car> getCarByModel(String model) {
        log.info("get Car by Model");
        return carRepository.findByModel(model);
    }

    @Override
    public List<Car> findByCarclass(Carclass carclass) {
        log.info("get Car by Carclass");
        return carRepository.findByCarclass(carclass);
    }
}