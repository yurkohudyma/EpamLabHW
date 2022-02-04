package com.epam.spring.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY;

@Data
public class CommentDto {

    @JsonProperty(access = READ_ONLY)
    private int id;

    @NotBlank
    private int orderId;

    @NotBlank
    private String text;

    @NotBlank
    private int userId;

}
