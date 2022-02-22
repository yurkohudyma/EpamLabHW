package com.epam.spring.service.repository;

import com.epam.spring.controller.dto.Orderstatus;
import com.epam.spring.service.model.Order;
import com.epam.spring.service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    boolean existsById(int id);

    Order findById(int id);

    List<Order> findByUserId(User userId);

    List<Order> findByTotalGreaterThan(float greaterThan);

    List<Order> findByTotalLessThan(float lessThan);

    List<Order> findByOrderstatus(Orderstatus orderstatus);

    List<Order> findAll();

}
