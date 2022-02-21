package com.epam.spring.service;

import com.epam.spring.controller.dto.UserDto;

public interface UserService {

    UserDto getUser(String email);

    UserDto createUser(UserDto userDto);

    UserDto updateUser(String email, UserDto userDto);

    void deleteUser(String email);
}
