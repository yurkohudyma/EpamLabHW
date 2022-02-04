package com.epam.spring.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY;

/**
 * User Dto
 *
 * @author Yurko Hudyma
 * @version 1.0
 * @since 27.01.2022
 */

@Data
@Builder
public class UserDto {

    @JsonProperty(access = READ_ONLY)
    private int userId;

    @NotBlank
    private String email;

    @NotBlank
    private AccessLevel accessLevel;


}
