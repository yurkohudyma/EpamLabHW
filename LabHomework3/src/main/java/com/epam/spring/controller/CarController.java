package com.epam.spring.controller;

//import com.epam.spring.service.CarService;

import com.epam.spring.controller.dto.CarDto;
import com.epam.spring.service.CarService;
import com.epam.spring.service.model.Car;
import com.epam.spring.service.repository.CarRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
@Api(tags = "SWAGGER documentation")
@ApiResponses({
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 500, message = "Internal Server Error")
})

public class CarController {


    CarService carService;
    CarRepository carRepository;

    /*

    TODO

    @ApiOperation("get Car by id")
    @GetMapping(value = "/car/{carId}")
    public CarDto getCarById(@PathVariable int carId) {
        return carService.getCarById(carId);
    }

    /*@ApiOperation("Get cars of a carclass")
    @GetMapping(value = "/carclass")
    public List<Car> getCarClassCars(Carclass carClass) {
        return carRepository.findbyCarclass(carClass);
    }

    */

    @ApiOperation("Get model")
    @GetMapping(value = "/model/{model}")
    public List<Car> findByModel(@PathVariable String model) {
        return carRepository.findByModel(model);
    }

    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Get car by Id")
    @GetMapping(value = "/car/{id}")
    public CarDto getCarById(@PathVariable int id) {
        return carService.getCarById(id);
    }
}

