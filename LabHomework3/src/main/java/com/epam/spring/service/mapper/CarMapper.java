package com.epam.spring.service.mapper;

import com.epam.spring.controller.dto.CarDto;
import com.epam.spring.service.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Set;

/**
 * MapStruct implementation (HW_4)
 */

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(source = "numberOfSeats", target = "seats")
    Set<CarDto> mapCarDtos(Set<Car> cars);

    @Mapping(source = "numberOfSeats", target = "seats")
    CarDto mapCarDto (Car cars);

    @Mapping(source = "seats", target = "numberOfSeats")
    Car mapCar (CarDto dto);


}
