package com.epam.spring.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    private int id;
    private int orderId;
    private int userId;
    private String text;


}
