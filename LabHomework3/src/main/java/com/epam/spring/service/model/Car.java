package com.epam.spring.service.model;

import com.epam.spring.controller.dto.Carclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
//@AllArgsConstructor

/*
@NamedNativeQuery(name = "findByFirstLetterAndPriceBetween",
        query = "select model, price from car as c where c.model not like ':firstLetter%' " +
                "and c.price between :startPriceRange and :endPriceRange", resultClass = Car.class)
*/
//@NamedQuery(name = "findMostExpensiveCar", query = "select max(price) from cars")


public class Car {

    /**
     * @YurkoHudyma stub for future use
     * @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq")
     * @SequenceGenerator(name = "my_seq", sequenceName = "my_seq", allocationSize = 1)
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //@Column(nullable = false, unique = true)
    private String model;

    @Column(nullable = false)
    private Carclass carclass;

    @Column(nullable = false)
    private float price;

    private String text;
    private int numberOfSeats;

    public Car(String model, Carclass carclass, float price, String text, int numberOfSeats) {
        this.model = model;
        this.carclass = carclass;
        this.price = price;
        this.text = text;
        this.numberOfSeats = numberOfSeats;
    }
}
