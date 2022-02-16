package com.epam.spring.service.model;

import com.epam.spring.controller.dto.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long userId;

    @OneToMany(mappedBy = "username")
    private List<Order> orders;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    private AccessLevel accessLevel;

    @Transient
    private Instant writtenOn;

    private String password;

    private String name;
}
