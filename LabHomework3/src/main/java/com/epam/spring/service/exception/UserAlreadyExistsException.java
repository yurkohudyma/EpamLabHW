package com.epam.spring.service.exception;

import com.epam.spring.service.model.ErrorType;

public class UserAlreadyExistsException extends ServiceException {

    public UserAlreadyExistsException(String message) {
        super("User already exists");
    }

    @Override
    ErrorType getErrorType() {
        return ErrorType.VALIDATION_ERROR_TYPE;
    }
}