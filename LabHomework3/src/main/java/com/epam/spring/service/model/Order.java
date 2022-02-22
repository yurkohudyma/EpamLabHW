package com.epam.spring.service.model;

import com.epam.spring.controller.dto.Orderstatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_table")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User userId;

    @JoinColumn(name = "car_id", nullable = false)
    private int car_id;

    @DateTimeFormat
    @Column(nullable = false)
    private LocalDate dateBegin;

    @DateTimeFormat
    @Column(nullable = false)
    private LocalDate dateEnd;

    @Column(name = "orderstatus")
    private Orderstatus orderstatus;

    @Column(name = "passportdata", nullable = false)
    private String passportData;

    private boolean driverNeeded;

    @Column(name = "total")
    private float total;

    private String additionalInfo;
}
