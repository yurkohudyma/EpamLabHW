package com.epam.spring.service.mapper;

import com.epam.spring.controller.dto.OrderDto;
import com.epam.spring.service.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    List<OrderDto> mapOrderDtos(List<Order> orders);

    OrderDto mapOrderDto(Order order);
}
