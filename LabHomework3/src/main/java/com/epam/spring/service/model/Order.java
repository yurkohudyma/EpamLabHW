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
    @Column(name = "order_id")
    private int id;

    @ManyToOne(/*fetch = FetchType.LAZY*/)
    @JoinColumn(name = "user_id")
    private User userId;

    @OneToOne
    @JoinColumn(name = "car_id", nullable = false)
    private Car carId;

    @DateTimeFormat
    @Column(name = "date_begin", nullable = false)
    private LocalDate dateBegin;

    @DateTimeFormat
    @Column(name = "date_end", nullable = false)
    private LocalDate dateEnd;

    private Orderstatus orderstatus;

    @Column(name = "passport_data", nullable = false)
    private String passportData;

    private boolean driverNeeded;

    private float total;

    private String additionalInfo;
}
