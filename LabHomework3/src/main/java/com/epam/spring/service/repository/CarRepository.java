package com.epam.spring.service.repository;

import com.epam.spring.controller.dto.Carclass;
import com.epam.spring.service.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    boolean existsById(int id);

    Car findById(int id);

    List<Car> findByModel(String model);

    List<Car> findByCarclass(Carclass carclass);

    List<Car> findAll();
}
