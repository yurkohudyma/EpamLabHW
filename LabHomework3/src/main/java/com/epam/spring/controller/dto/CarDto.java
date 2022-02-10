package com.epam.spring.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY;

/**
 * Order Dto
 *
 * @author Yurko Hudyma
 * @version 1.0
 * @since 27.01.2022
 */

@Data
public class CarDto {

    @JsonProperty(access = READ_ONLY)
    private int id;

    @NotBlank(message = "{model.notblank}")
    private String model;

    @NotBlank(message = "{carclass.notblank}")
    private CarClass carClass;

    @Positive
    private float price;

    @Positive
    private int seats;

    private int description;

}

/**
 * DIFFERENCE BETWEEN @@NOTEMPTY, NOTNULL, NOTBLANK
 * String name = null;
 * NotNull = false
 * NotEmpty = false
 * NotBlank = false
 * <p>
 * String nam = "";
 * NotNull = true
 * NotEmpty = false
 * NotBlank = false
 * <p>
 * String name = "  ";
 * NotNull = true
 * NotEmpty = true
 * NotBlank = false
 * <p>
 * String name = "Махно"
 * NotNull = true
 * NotEmpty = true
 * NotBlank = true
 */