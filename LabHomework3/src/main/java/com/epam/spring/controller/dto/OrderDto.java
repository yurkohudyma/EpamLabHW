package com.epam.spring.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY;

/**
 * Order Dto
 *
 * @author Yurko Hudyma
 * @version 1.0
 * @since 27.01.2022
 */

@Data
public class OrderDto {

    @JsonProperty(access = READ_ONLY)
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
