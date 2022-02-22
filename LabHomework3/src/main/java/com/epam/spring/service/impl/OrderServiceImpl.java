package com.epam.spring.service.impl;

import com.epam.spring.controller.dto.OrderDto;
import com.epam.spring.controller.dto.Orderstatus;
import com.epam.spring.service.OrderService;
import com.epam.spring.service.exception.EntityNotFoundException;
import com.epam.spring.service.model.Order;
import com.epam.spring.service.model.User;
import com.epam.spring.service.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor

public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public Order getById(int id) {
        log.info("get Order by id {}", id);
        if (orderRepository.existsById(id)) {
            return orderRepository.findById(id);
        }
        throw new EntityNotFoundException("Order not found");
    }

    @Override
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @Override
    public List<Order> getByUserId(User userId) {
        return orderRepository.findByUserId(userId);
    }

    @Override
    public List<Order> getByOrderstatus(Orderstatus orderstatus) {
        return orderRepository.findByOrderstatus(orderstatus);
    }

    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        return null;
    }

    @Override
    public OrderDto updateOrder(int id, OrderDto orderDto) {
        return null;
    }

    @Override
    public void deleteOrder(int id) {

    }
}