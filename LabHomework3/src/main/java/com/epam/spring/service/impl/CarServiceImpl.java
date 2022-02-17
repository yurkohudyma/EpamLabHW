package com.epam.spring.service.impl;

import com.epam.spring.controller.dto.CarDto;
import com.epam.spring.service.CarService;
import com.epam.spring.service.exception.EntityNotFoundException;
import com.epam.spring.service.model.Car;
import com.epam.spring.service.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Override
    public CarDto getCarById(int id) {
        log.info("getCar by id {}", id);
        if (carRepository.existsById(id)) {
            Car car = carRepository.findById(id);
            return mapCarToCarDto(car);
        }
        throw new EntityNotFoundException("Car not found");
    }

    private CarDto mapCarToCarDto(Car car) {
        return CarDto.builder()
                .id(car.getId())
                .model(car.getModel())
                .carclass(car.getCarclass())
                .price(car.getPrice())
                .seats(car.getNumberOfSeats())
                .text(car.getText())
                .build();
    }

    /**
     *
     * TODO
     *
     *
     private final MappingService mappingService;

     @Override public CarDto createCar(CarClass carClass, CarDto carDto) {
     log.info("createCar by carclass {}", carClass);
     Car newCar = CarMapper.INSTANCE.mapCar(carDto);
     newCar.setCarClass(carClass);
     newCar = mappingService.createCar(newCar);
     return CarMapper.INSTANCE.mapCarDto(newCar);
     }

     @Override public CarDto updateCar(CarDto carDto, int carId) {
     log.info("updateCar by id {}", carId);
     return null;
     }

     @Override public void deleteCar(int carId) {

     }

     @Override public List<Car> findByCarClass(CarClass carClass) {
     return carRepository.findbyCarClass(carClass);
     }

     /*@Override
     public Set<CarDto> getCarClassCars(CarClass carClass) {
     //Set<Car> cars = carRepository.getCarByCarClass(carClass);
     Set<Car> cars = carRepository.findByCarclass(carClass);
     return CarMapper.INSTANCE.mapCarDtos(cars);
     }

     @Override public Set<CarDto> getCars() {
     Set<Car> cars = carRepository.getCars();
     return CarMapper.INSTANCE.mapCarDtos(cars);
     }
     */


}