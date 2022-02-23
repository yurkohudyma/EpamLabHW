package com.epam.spring.service.model;

import com.epam.spring.controller.dto.Accesslevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    private Accesslevel accesslevel;

    @Transient
    private Instant writtenOn;

    private String password;

    private String name;
}
