package com.epam.spring.service.mapper;

import com.epam.spring.controller.dto.CarDto;
import com.epam.spring.controller.dto.CarDto.CarDtoBuilder;
import com.epam.spring.service.model.Car;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-22T16:36:42+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class CarMapperImpl implements CarMapper {

    @Override
    public List<CarDto> mapCarDtos(List<Car> cars) {
        if ( cars == null ) {
            return null;
        }

        List<CarDto> list = new ArrayList<CarDto>( cars.size() );
        for ( Car car : cars ) {
            list.add( mapCarDto( car ) );
        }

        return list;
    }

    @Override
    public CarDto mapCarDto(Car cars) {
        if ( cars == null ) {
            return null;
        }

        CarDtoBuilder carDto = CarDto.builder();

        carDto.id( cars.getId() );
        carDto.model( cars.getModel() );
        carDto.carclass( cars.getCarclass() );
        carDto.price( cars.getPrice() );
        carDto.seats( cars.getSeats() );
        carDto.text( cars.getText() );

        return carDto.build();
    }
}
