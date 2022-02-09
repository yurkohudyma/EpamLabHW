package com.epam.spring.service.model;

import com.epam.spring.controller.dto.CarClass;
import com.epam.spring.controller.dto.OrderStatus;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
public class Order {

    private int id;
    private int userId;
    private int carId;
    private String model;
    private CarClass carClass;

    @DateTimeFormat
    private LocalDate dateBegin;

    @DateTimeFormat
    private LocalDate dateEnd;

    @NotBlank
    private OrderStatus orderStatus;

    @NotBlank
    private String passportData;

    @NotBlank
    private boolean driverNeeded;

    private float price;
    private String additionalInfo;
    private String userName;

}
