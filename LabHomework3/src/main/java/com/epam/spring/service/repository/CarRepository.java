package com.epam.spring.service.repository;

import com.epam.spring.controller.dto.Carclass;
import com.epam.spring.service.model.Car;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {

    boolean existsById(int id);

    Car findById(int id);

    Car findByModel(String model);

    List<Car> findByCarclass(Carclass carclass);

    List<Car> findAll(Sort sort);
}
