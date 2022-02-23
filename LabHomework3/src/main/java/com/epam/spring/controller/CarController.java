package com.epam.spring.controller;

import com.epam.spring.controller.dto.CarDto;
import com.epam.spring.controller.dto.Carclass;
import com.epam.spring.service.CarService;
import com.epam.spring.service.mapper.CarMapper;
import com.epam.spring.service.model.Car;
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
@Api(tags = "SWAGGER")
@ApiResponses({
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 500, message = "Internal Server Error")
})

public class CarController {

    private final CarService carService;

    @ApiOperation("Get cars of a carclass")
    @GetMapping(value = "/carCLASS/{carclass}")
    public List<CarDto> getCarClassCars(@PathVariable Carclass carclass) {
        List<Car> cars = carService.findByCarclass(carclass);
        return CarMapper.INSTANCE.mapCarDtos(cars);
    }

    @ApiOperation("Get model")
    @GetMapping(value = "/carMODEL/{model}")
    public CarDto findByModel(@PathVariable String model) {
        Car car = carService.getCarByModel(model);
        return CarMapper.INSTANCE.mapCarDto(car);
    }

    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Get car by Id")
    @GetMapping(value = "/carID/{id}")
    public CarDto getCarById(@PathVariable int id) {
        Car car = carService.getCarById(id);
        return CarMapper.INSTANCE.mapCarDto(car);
    }

    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Get all cars")
    @GetMapping(value = "/cars")
    public List<CarDto> getAllCars() {
        List<Car> cars = carService.getCars();
        return CarMapper.INSTANCE.mapCarDtos(cars);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Create car")
    @PostMapping(value = "/newcar")
    public CarDto createCar(@RequestBody CarDto carDto) {
        return carService.createCar(carDto);
    }
}