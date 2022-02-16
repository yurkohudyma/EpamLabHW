package com.epam.spring.controller.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Email;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {

    @JsonProperty(access = READ_ONLY)
    private long id;

    @Email
    @NotBlank(message = "{email.notblank}"/*, groups = OnCreate.class*/)
    private String email;

    @NotBlank(message = "{accessLevel.notblank}")
    private AccessLevel accessLevel;

    String password;

    String name;


    public String getRepeatPassword() {
        return password;
    }
}
