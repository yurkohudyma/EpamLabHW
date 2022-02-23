package com.epam.spring.service.model;

import com.epam.spring.controller.dto.Carclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Positive;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "car_table")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private int id;

    private String model;

    @Column(nullable = false)
    private Carclass carclass;

    @Column(nullable = false)
    private float price;

    private String text;

    @Positive
    private int seats;
}
