package com.epam.spring;

import com.epam.spring.controller.dto.CarClass;
import com.epam.spring.service.model.Car;
import com.epam.spring.service.model.Comment;
import com.epam.spring.service.repository.CarRepository;
import com.epam.spring.service.repository.impl.CommentJdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CarRentalApp implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(CarRentalApp.class, args);
    }

    @Autowired
    CarRepository carRepository;

    @Autowired
    CommentJdbcTemplate commentJdbcTemplate;

    @Override
    public void run(String... args) throws Exception {

        Car car1 = new Car("Запорожець", CarClass.MINI, 15.32f);
        Car car2 = new Car("Renault Logan", CarClass.ECONOMY, 35.42f);
        Car car3 = new Car("Volkswagen Passat", CarClass.ESTATE, 47.12f);

        List<Car> carList = Arrays.asList(car1, car2, car3);

        carRepository.saveAll(carList);

        carRepository.findAll().forEach(System.out::println);

        //System.out.println("///////"+carRepository.findByFirstLetterAndPriceBetween('R', 20f, 40f));

        commentJdbcTemplate.createSchema();
        commentJdbcTemplate.createTableComments();

        commentJdbcTemplate.insertComment(new Comment(371, 532, 3743, "інтеропіпочний цуріпопік"));

        commentJdbcTemplate.findAll().forEach(System.out::println);
    }
}
