package com.epam.spring.service;

import com.epam.spring.controller.dto.Accesslevel;
import com.epam.spring.controller.dto.UserDto;
import com.epam.spring.service.model.User;

import java.util.List;

public interface UserService {

    User getUserById(int id);

    List<User> getUsers();

    List<User> getUserByEmail(String email);

    List<User> findByAccesslevel(Accesslevel accesslevel);

    UserDto createUser(UserDto userDto);

    UserDto updateUser(String email, UserDto userDto);

    void deleteUser(String email);
}
