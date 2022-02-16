package com.epam.spring.service.impl;

import com.epam.spring.controller.dto.UserDto;
import com.epam.spring.service.MappingService;
import com.epam.spring.service.UserService;
import com.epam.spring.service.exception.UserAlreadyExistsException;
import com.epam.spring.service.exception.UserNotFoundException;
import com.epam.spring.service.model.User;
import com.epam.spring.service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final MappingService mappingService;

    @Override
    public UserDto getUser(String email) {
        log.info("getUser by email {}", email);
        User user = userRepository.findByEmail(email)
                .orElseThrow(UserNotFoundException::new);
        return mappingService.mapUserToUserDto(user);
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        log.info("createUser by email {}", userDto.getEmail());
        if (userRepository.existsByEmail(userDto.getEmail())) {
            throw new UserAlreadyExistsException("User already exists");
        }
        User user = mappingService.mapUserDtotoUser(userDto);
        /** this gonna `upsert` user by INSERT, as it has not been persisted yet */
        user = userRepository.save(user);
        log.info("User with email {}, id{} successfully created", user.getEmail(), user.getUserId());
        return mappingService.mapUserToUserDto(user);
    }

    @Override
    public UserDto updateUser(String email, UserDto userDto) {
        log.info("updateUser by email{}", email);
        User persistedUser = userRepository.findByEmail(email)
                .orElseThrow(UserNotFoundException::new);
        persistedUser = mappingService.populateUsersWithPresentUserDtoFields(persistedUser, userDto);
        /** this gonna 'upsert' user by UPDATE, as it's been already persisted OR managed by Hibernate */
        User storedUser = userRepository.save(persistedUser);
        log.info("User with email{} successfully updated", storedUser.getEmail());
        return mappingService.mapUserToUserDto(persistedUser);
    }

    @Override
    public void deleteUser(String email) {
        log.info("deleteUser with email{}", email);
        User user = userRepository.findByEmail(email)
                .orElseThrow(UserNotFoundException::new);
        userRepository.delete(user);
        log.info("User with email{} successfully deleted", email);
    }

    private UserDto mapUserToUserDto(User user) {
        return UserDto.builder()
                .id(user.getUserId())
                .email(user.getEmail())
                .accessLevel(user.getAccessLevel())
                .build();
    }

    private User mapUserDtoToUser(UserDto userDto) {
        return User.builder()
                .userId(userDto.getId())
                .email(userDto.getEmail())
                .accessLevel(userDto.getAccessLevel())
                .build();
    }
}
