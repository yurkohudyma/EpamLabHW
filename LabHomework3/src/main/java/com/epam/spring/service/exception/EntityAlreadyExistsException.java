package com.epam.spring.service.exception;

import com.epam.spring.service.model.ErrorType;

public class EntityAlreadyExistsException extends ServiceException {

    public EntityAlreadyExistsException(String message) {
        super("Entity already exists");
    }

    @Override
    ErrorType getErrorType() {
        return ErrorType.VALIDATION_ERROR_TYPE;
    }
}