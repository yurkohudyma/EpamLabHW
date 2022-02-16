package com.epam.spring.service.impl;


import com.epam.spring.controller.dto.UserDto;
import com.epam.spring.service.MappingService;
import com.epam.spring.service.exception.PasswordNotValidException;
import com.epam.spring.service.model.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class MappingServiceImpl implements MappingService {

    @Override
    public UserDto mapUserToUserDto(User user) {
        return UserDto.builder()
                .email(user.getEmail())
                .accessLevel(user.getAccessLevel())
                .build();
    }

    @Override
    public User mapUserDtotoUser(UserDto userDto) {
        return User.builder()
                .email(userDto.getEmail())
                .accessLevel(userDto.getAccessLevel())
                .password(extractPassword(userDto))
                .build();
    }

    private String extractPassword(UserDto userDto) {
        if (StringUtils.isNotBlank(userDto.getPassword()) &&
                StringUtils.equals(userDto.getPassword(), userDto.getRepeatPassword())) {
            return userDto.getPassword();
        } else {
            throw new PasswordNotValidException();
        }
    }

    @Override
    public User populateUsersWithPresentUserDtoFields(User user, UserDto userDto) {
        String name = userDto.getName();
        if (Objects.nonNull(name)) {
            user.setName(name);
        }
        return user;
    }
}
