package com.epam.spring;

import com.epam.spring.service.model.Comment;
import com.epam.spring.service.repository.impl.CommentJdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarRentalApp implements CommandLineRunner {

    @Autowired
    CommentJdbcTemplate commentJdbcTemplate;

    public static void main(String[] args) {

        SpringApplication.run(CarRentalApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        commentJdbcTemplate.createSchema();
        commentJdbcTemplate.createTableComments();

        commentJdbcTemplate.insertComment(new Comment(371, 532, 3743, "інтеропіпочний цуріпопік"));
        commentJdbcTemplate.insertComment(new Comment(4349385, 54332, 3764343, "фет фрумос і сестра його макальонґуа"));

        //commentJdbcTemplate.findAll().forEach(System.out::println);
    }
}
