package com.epam.spring.service;

import com.epam.spring.controller.dto.UserDto;
import com.epam.spring.service.model.User;

public interface MappingService {

    UserDto mapUserToUserDto(User user);

    User mapUserDtotoUser(UserDto userDto);

    User populateUsersWithPresentUserDtoFields(User user, UserDto userDto);


}
