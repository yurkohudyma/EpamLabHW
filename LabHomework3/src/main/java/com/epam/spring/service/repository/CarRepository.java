package com.epam.spring.service.repository;

import com.epam.spring.controller.dto.CarClass;
import com.epam.spring.service.model.Car;

import java.util.Set;

public interface CarRepository {

    Car createCar(Car newCar);

    Set<Car> getCarByCarClass(CarClass carClass);
}


/* TODO
 Parameter 0 of constructor in com.epam.spring.service.impl.CarServiceImpl required a bean of type
 'com.epam.spring.service.repository.CarRepository' that could not be found.
 Consider defining a bean of type 'com.epam.spring.service.repository.CarRepository' in your configuration.

 Exception encountered during context initialization - cancelling refresh attempt:
 org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'carServiceImpl'
 defined in file [S:\TOOLS\IntelliJ\EpamLabHW\LabHomework3\target\classes\com\epam\spring\service\impl\CarServiceImpl.class]:
 Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException:
 No qualifying bean of type 'com.epam.spring.service.repository.CarRepository' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}

 */