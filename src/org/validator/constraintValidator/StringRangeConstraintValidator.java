package org.validator.constraintValidator;

import org.validator.annotations.StringRange;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StringRangeConstraintValidator implements ConstraintValidator<StringRange, String> {

    private int minLength;
    private int maxLength;

    @Override
    public void initialize(StringRange range) {

        minLength = range.minLength();
        maxLength = range.maxLength();
    }

    @Override
    public boolean isValid(String field, ConstraintValidatorContext ctx) {

        if (field.length() < minLength || field.length() > maxLength) {
            return false;
        }

        return true;
    }

}