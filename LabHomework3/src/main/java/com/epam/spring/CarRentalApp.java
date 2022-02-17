package com.epam.spring;

import com.epam.spring.controller.dto.Carclass;
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

    @Autowired
    CarRepository carRepository;
    @Autowired
    CommentJdbcTemplate commentJdbcTemplate;

    public static void main(String[] args) {

        SpringApplication.run(CarRentalApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Car car1 = new Car("Запорожець", Carclass.MINI, 15.32f, "бімба", 2);
        Car car2 = new Car("Renault Logan", Carclass.ECONOMY, 35.42f, "економна і компактна", 4);
        Car car3 = new Car("Volkswagen Passat", Carclass.ESTATE, 47.12f, "файна машина", 5);

        List<Car> carList = Arrays.asList(car1, car2, car3);

        carRepository.saveAll(carList);

        carRepository.findAll().forEach(System.out::println);

        commentJdbcTemplate.createSchema();
        commentJdbcTemplate.createTableComments();

        commentJdbcTemplate.insertComment(new Comment(371, 532, 3743, "інтеропіпочний цуріпопік"));
        commentJdbcTemplate.insertComment(new Comment(4349385, 54332, 3764343, "фет фрумос і сестра його макальонґуа"));

        commentJdbcTemplate.findAll().forEach(System.out::println);


        carRepository.findByModel("Renault Logan").forEach(System.out::println);
        System.out.println(carRepository.findById(1));

        /** TODO

         System.out.println(">>>>"+carRepository.findByFirstLetterAndPriceBetween('R', 20f, 40f));
         carRepository.findbyCarclass(Carclass.MINI).forEach(System.out::println);

         */

    }

}
