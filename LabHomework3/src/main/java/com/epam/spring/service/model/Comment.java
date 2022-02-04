package com.epam.spring.service.model;

import lombok.Data;

@Data
public class Comment {

    private int id;
    private int orderId;
    private int userId;
    private String text;
}
