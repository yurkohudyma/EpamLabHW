package com.epam.spring.service.mapper;

import com.epam.spring.controller.dto.UserDto;
import com.epam.spring.service.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    List<UserDto> mapUserDtos(List<User> users);

    UserDto mapUserDto(User user);
}
