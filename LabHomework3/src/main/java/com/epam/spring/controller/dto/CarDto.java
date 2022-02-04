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

    @NotBlank
    private String model;

    @NotBlank
    private CarClass carClass;

    @Positive
    private float price;

    private int description;

}
