package com.epam.spring.service.mapper;

import com.epam.spring.controller.dto.CarDto;
import com.epam.spring.service.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    List<CarDto> mapCarDtos(List<Car> cars);

    List<Car> mapCars(List<CarDto> cars);

    CarDto mapCarDto(Car cars);

    Car mapCar(CarDto dto);


}
