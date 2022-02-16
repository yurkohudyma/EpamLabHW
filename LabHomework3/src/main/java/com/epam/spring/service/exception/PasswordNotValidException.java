package com.epam.spring.service.exception;

public class PasswordNotValidException extends RuntimeException {

    public PasswordNotValidException() {
        super("Password not valid");
    }
}
