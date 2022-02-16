package com.epam.spring.service.model;

import com.epam.spring.controller.dto.CarClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

/*
@NamedNativeQuery(name = "findByFirstLetterAndPriceBetween",
        query = "select model, price from car as c where c.model not like ':firstLetter%' " +
                "and c.price between :startPriceRange and :endPriceRange", resultClass = Car.class)
*/
//@NamedQuery(name = "findMostExpensiveCar", query = "select max(price) from cars")


public class Car {

    /**
     * @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq")
     * @SequenceGenerator(name = "my_seq", sequenceName = "my_seq", allocationSize = 1)
     * @YurkoHudyma stub for future use
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String model;

    @Column(nullable = false)
    private CarClass carClass;

    @Column(nullable = false)
    private float price;

    private int carInfo;
    private int numberOfSeats;

    public Car(String model, CarClass carClass, float price) {
        this.model = model;
        this.carClass = carClass;
        this.price = price;
    }
}
