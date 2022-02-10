package com.epam.spring.service.exception;

public class PasswordNotValidException extends RuntimeException {

    public PasswordNotValidException(String message) {
        super(message);
    }
}
