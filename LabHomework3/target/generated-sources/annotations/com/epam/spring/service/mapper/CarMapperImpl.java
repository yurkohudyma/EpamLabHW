package com.epam.spring.service.mapper;

import com.epam.spring.controller.dto.CarDto;
import com.epam.spring.service.model.Car;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-16T18:16:02+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class CarMapperImpl implements CarMapper {

    @Override
    public Set<CarDto> mapCarDtos(Set<Car> cars) {
        if ( cars == null ) {
            return null;
        }

        Set<CarDto> set = new HashSet<CarDto>( Math.max( (int) ( cars.size() / .75f ) + 1, 16 ) );
        for ( Car car : cars ) {
            set.add( mapCarDto( car ) );
        }

        return set;
    }

    @Override
    public CarDto mapCarDto(Car cars) {
        if ( cars == null ) {
            return null;
        }

        CarDto carDto = new CarDto();

        carDto.setSeats( cars.getNumberOfSeats() );
        if ( cars.getId() != null ) {
            carDto.setId( cars.getId().intValue() );
        }
        carDto.setModel( cars.getModel() );
        carDto.setCarClass( cars.getCarClass() );
        carDto.setPrice( cars.getPrice() );

        return carDto;
    }

    @Override
    public Car mapCar(CarDto dto) {
        if ( dto == null ) {
            return null;
        }

        Car car = new Car();

        car.setNumberOfSeats( dto.getSeats() );
        car.setId( (long) dto.getId() );
        car.setModel( dto.getModel() );
        car.setCarClass( dto.getCarClass() );
        car.setPrice( dto.getPrice() );

        return car;
    }
}
