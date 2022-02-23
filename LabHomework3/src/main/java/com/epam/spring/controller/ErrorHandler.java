package com.epam.spring.controller;

import com.epam.spring.controller.dto.ErrorDto;
import com.epam.spring.service.exception.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<ErrorDto> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        log.error("handleMethodArgumentNotValidException: exception {}", e.getMessage(), e);
        return e.getBindingResult().getAllErrors().stream()
                .map(err -> new ErrorDto(err.getDefaultMessage()))
                .collect(Collectors.toList());
    }

    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorDto handleEntityNotFoundException(EntityNotFoundException e) {
        log.error("handleEntityNotFoundException: exception {)", e.getMessage(), e);
        return new ErrorDto(e.getMessage());
    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorDto handleNullPointerException(NullPointerException e) {
        log.error("NullPointerException: exception {)", e.getMessage(), e);
        return new ErrorDto(e.getMessage());
    }


}
