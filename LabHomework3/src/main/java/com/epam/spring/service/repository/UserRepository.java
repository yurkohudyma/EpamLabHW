package com.epam.spring.service.repository;

import com.epam.spring.service.model.User;

import java.util.List;

public interface UserRepository {

    User getUser (String email);

    List<User> listUsers();

    User createUser(User user);

    User updateUser(String email, User user);

    void deleteUser(String email);
}
