package com.epam.spring.service.impl;

import com.epam.spring.controller.dto.UserDto;
import com.epam.spring.service.UserService;
import com.epam.spring.service.model.User;
import com.epam.spring.service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Override
    public UserDto getUser(String email) {
        log.info("getUser by email {}", email);
        User user = userRepository.getUser(email);
        return mapUserToUserDto(user);
    }

    @Override
    public List<UserDto> listUsers() {
        log.info("get list of Users");
        return userRepository.listUsers()
                .stream()
                .map(this::mapUserToUserDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        log.info("createUser by email {}", userDto.getEmail());
        User user = mapUserDtoToUser(userDto);
        user = userRepository.createUser(user);
        return mapUserToUserDto(user);
    }

    @Override
    public UserDto updateUser(String email, UserDto userDto) {
        log.info("updateUser by email{}", email);
        User user = mapUserDtoToUser(userDto);
        user = userRepository.updateUser(email,user);
        return mapUserToUserDto(user);
    }

    @Override
    public void deleteUser(String email) {
        log.info("deleteUser with email{}", email);
        userRepository.deleteUser(email);
    }

    private UserDto mapUserToUserDto(User user) {
        return UserDto.builder()
                .userId(user.getUserId())
                .email(user.getEmail())
                .accessLevel(user.getAccessLevel())
                .build();
    }

    private User mapUserDtoToUser(UserDto userDto) {
        return User.builder()
                .userId(userDto.getUserId())
                .email(userDto.getEmail())
                .accessLevel(userDto.getAccessLevel())
                .build();
    }
}
