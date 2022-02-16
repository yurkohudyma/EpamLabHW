package com.epam.spring.service.model;

import com.epam.spring.controller.dto.CarClass;
import com.epam.spring.controller.dto.OrderStatus;
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
    private long orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User username;

    @Column(name = "model", nullable = false, unique = true)
    private String model;

    @Column(name = "carclass", nullable = false)
    private CarClass carClass;

    @DateTimeFormat
    private LocalDate dateBegin;

    @DateTimeFormat
    private LocalDate dateEnd;

    @Column(name = "orderstatus", nullable = false)
    private OrderStatus orderStatus;

    @Column(name = "passportdata", nullable = false)
    private String passportData;

    private boolean driverNeeded;

    @Column(name = "price", nullable = false)
    private float price;

    private String additionalInfo;

}
