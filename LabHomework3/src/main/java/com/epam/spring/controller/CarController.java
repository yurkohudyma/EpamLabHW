package com.epam.spring.controller;

import com.epam.spring.controller.dto.CarClass;
import com.epam.spring.controller.dto.CarDto;
import com.epam.spring.service.CarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Api(tags = "SWAGGER documentation")
@ApiResponses({
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 500, message = "Internal Server Error")
})

public class CarController {

    CarService carService;

    @ApiOperation("get Car by id")
    @GetMapping(value = "/car/{carId}")
    public CarDto getCarById(@PathVariable int carId) {
        return carService.getCarById(carId);
    }

    @ApiOperation("Get cars of a carclass")
    @GetMapping(value = "/carclass")
    public Set<CarDto> getCarClassCars(CarClass carClass) {
        return carService.getCarClassCars(carClass);
    }


}
