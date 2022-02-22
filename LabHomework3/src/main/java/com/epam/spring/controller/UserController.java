package com.epam.spring.controller;

import com.epam.spring.controller.dto.Accesslevel;
import com.epam.spring.controller.dto.UserDto;
import com.epam.spring.service.UserService;
import com.epam.spring.service.mapper.UserMapper;
import com.epam.spring.service.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
@Api(tags = "SWAGGER")
@ApiResponses({
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 500, message = "Internal Server Error")
})

public class UserController {

    private final UserService userService;

    @ApiOperation("Get users of a accesslevel")
    @GetMapping(value = "/userACCESSLEVEL/{accesslevel}")
    public List<UserDto> getAccesslevelUsers(@PathVariable Accesslevel accesslevel) {
        List<User> users = userService.findByAccesslevel(accesslevel);
        return UserMapper.INSTANCE.mapUserDtos(users);
    }

    @ApiOperation("Find user by email")
    @GetMapping(value = "/userEMAIL/{email}")
    public List<UserDto> findByEmail(@PathVariable String email) {
        List<User> users = userService.getUserByEmail(email);
        return UserMapper.INSTANCE.mapUserDtos(users);
    }

    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Get user by id")
    @GetMapping(value = "/userID/{id}")
    public UserDto getUserById(@PathVariable int id) {
        User user = userService.getUserById(id);
        return UserMapper.INSTANCE.mapUserDto(user);
    }

    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Get all users")
    @GetMapping(value = "/users")
    public List<UserDto> getAllUsers() {
        List<User> users = userService.getUsers();
        return UserMapper.INSTANCE.mapUserDtos(users);
    }
}