package com.epam.spring.service.model;

import com.epam.spring.controller.dto.AccessLevel;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class User {

    private int userId;
    private String email;
    private AccessLevel accessLevel;
    private Instant writtenOn;
}
