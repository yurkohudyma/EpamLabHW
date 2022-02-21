package com.epam.spring.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY;

/**
 * @author Yurko Hudyma
 * @version 1.0
 * @since 27.01.2022
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarDto {

    @JsonProperty(access = READ_ONLY)
    private int id;

    @NotBlank(message = "{model.notblank}")
    private String model;

    @NotBlank(message = "{carclass.notblank}")
    private Carclass carclass;

    @Positive
    private float price;

    @Positive
    private int seats;

    private String text;

}