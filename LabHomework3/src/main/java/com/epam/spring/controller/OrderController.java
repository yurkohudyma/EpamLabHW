package com.epam.spring.controller;

import com.epam.spring.controller.dto.OrderDto;
import com.epam.spring.controller.dto.Orderstatus;
import com.epam.spring.service.OrderService;
import com.epam.spring.service.mapper.OrderMapper;
import com.epam.spring.service.model.Order;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
@Api(tags = "SWAGGER")
@ApiResponses({
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 500, message = "Internal Server Error")
})

public class OrderController {

    private final OrderService orderService;

    @ApiOperation("Get orders of a orderstatus")
    @GetMapping(value = "/orderORDERSTATUS/{orderstatus}")
    public List<OrderDto> getbyOrderstatus(@PathVariable Orderstatus orderstatus) {
        List<Order> orders = orderService.getByOrderstatus(orderstatus);
        return OrderMapper.INSTANCE.mapOrderDtos(orders);
    }

    @ApiOperation("Find order by id")
    @GetMapping(value = "/orderID/{id}")
    public OrderDto findById(@PathVariable int id) {
        Order order = orderService.getById(id);
        return OrderMapper.INSTANCE.mapOrderDto(order);
    }

    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Get orders by user id")
    @GetMapping(value = "/ordersbyUserId/{userId}")
    public List<OrderDto> getOrdersById(@PathVariable int userId) {
        List<Order> orders = orderService.getByUserId(userId);
        return OrderMapper.INSTANCE.mapOrderDtos(orders);
    }

    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Get all orders")
    @GetMapping(value = "/orders")
    public List<OrderDto> getAllOrders() {
        List<Order> orders = orderService.getOrders();
        return OrderMapper.INSTANCE.mapOrderDtos(orders);
    }
}