package com.epam.spring.service.exception;

import com.epam.spring.service.model.ErrorType;

public abstract class ServiceException extends RuntimeException {

    abstract ErrorType getErrorType();

    public ServiceException(String message) {
        super(message);
    }
}
