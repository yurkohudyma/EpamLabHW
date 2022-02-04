package com.epam.spring.service.mapper;

import com.epam.spring.controller.dto.CarDto;
import com.epam.spring.service.model.Car;
import org.mapstruct.factory.Mappers;

import java.util.Set;

public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    Set<CarDto> mapCarDtos (Set<Car>cars);

    CarDto mapCarDto (Car cars);

    Car mapCar (CarDto dto);
}
