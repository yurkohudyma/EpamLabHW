package com.epam.spring.controller.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DescriptionValidator implements ConstraintValidator<ValidDescription, String> {

    @Override
    public boolean isValid(String orderComment, ConstraintValidatorContext context) {
        return orderComment.split(" ").length > 10;
    }

    @Override
    public void initialize(ValidDescription contactNumber) {
    }
}
