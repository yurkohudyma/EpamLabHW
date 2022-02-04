package com.epam.spring.service.model;

import com.epam.spring.controller.dto.CarClass;
import lombok.Data;

@Data
public class Car {

    private String id;
    private String model;
    private CarClass carClass;
    private float price;
    private int carInfo;
}
