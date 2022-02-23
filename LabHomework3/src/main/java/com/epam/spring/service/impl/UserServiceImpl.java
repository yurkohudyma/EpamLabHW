package com.epam.spring.service.impl;

import com.epam.spring.controller.dto.Accesslevel;
import com.epam.spring.controller.dto.UserDto;
import com.epam.spring.service.UserService;
import com.epam.spring.service.exception.UserNotFoundException;
import com.epam.spring.service.model.User;
import com.epam.spring.service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUserById(int id) {
        log.info("get User by id {}", id);
        if (userRepository.existsById(id)) {
            return userRepository.findById(id);
        }
        throw new UserNotFoundException("User not found");
    }

    @Override
    public List<User> getUsers() {
        log.info("get All Users sorted by name");
        return userRepository.findAll(Sort.by("name"));
    }

    @Override
    public List<User> getUserByEmail(String email) {
        log.info("get User by email {}", email);
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> findByAccesslevel(Accesslevel accesslevel) {
        log.info("get User by accesslevel {}", accesslevel);
        return userRepository.findByAccesslevel(accesslevel);
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto updateUser(String email, UserDto userDto) {
        return null;
    }

    @Override
    public void deleteUser(String email) {

    }
}