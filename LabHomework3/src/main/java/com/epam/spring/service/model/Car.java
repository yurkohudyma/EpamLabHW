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

public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String model;

    @Column(nullable = false)
    private Carclass carclass;

    @Column(nullable = false)
    private float price;

    private String text;

    @Positive
    private int seats;

    public Car(String model, Carclass carclass, float price, String text, int seats) {
        this.model = model;
        this.carclass = carclass;
        this.price = price;
        this.text = text;
        this.seats = seats;
    }
}
