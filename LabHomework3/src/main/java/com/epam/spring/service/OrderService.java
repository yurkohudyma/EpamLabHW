package com.epam.spring.service;

import com.epam.spring.controller.dto.OrderDto;
import com.epam.spring.controller.dto.Orderstatus;
import com.epam.spring.service.model.Order;

import java.util.List;

public interface OrderService {

    Order getById(int id);

    List<Order> getOrders();

    List<Order> getByUserId(int userId);

    List<Order> getByOrderstatus(Orderstatus orderstatus);

    OrderDto createOrder(OrderDto orderDto);

    OrderDto updateOrder(int id, OrderDto orderDto);

    void deleteOrder(int id);
}
