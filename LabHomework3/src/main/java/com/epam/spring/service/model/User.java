package com.epam.spring.service.model;

import com.epam.spring.controller.dto.Accesslevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @OneToMany(mappedBy = "userId")
    private List<Order> orders;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    private Accesslevel accesslevel;

    @Transient
    private Instant writtenOn;

    private String password;

    private String name;
}
