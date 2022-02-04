package com.epam.spring.service.repository.impl;

import com.epam.spring.service.model.User;
import com.epam.spring.service.repository.UserRepository;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private final List<User> list = new ArrayList<>();

    @Override
    public User getUser(String email) {
        return list.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public List<User> listUsers() {
        return new ArrayList<>();
    }

    @Override
    public User createUser(User user) {
        user.setWrittenOn(Instant.now());
        list.add(user);
        return user;
    }

    /** Update user means delete previous,
     * acknowledge, insert new
     */

    @Override
    public User updateUser(String email, User user) {
        boolean isDeleted = list.removeIf(u -> u.getEmail().equals(email));
            if (isDeleted) {
                list.add(user);
            }
            else {
                throw new RuntimeException("User not found");
            }
        return user;
    }

    @Override
    public void deleteUser(String email) {
        list.removeIf(user -> user.getEmail().equals(email));
    }
}
