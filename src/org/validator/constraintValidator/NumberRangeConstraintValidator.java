package org.validator.constraintValidator;

import org.validator.annotations.NumberRange;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NumberRangeConstraintValidator implements ConstraintValidator<NumberRange, Integer> {

    private int minValue;
    private int maxValue;

    @Override
    public void initialize(NumberRange range) {

        minValue = range.minValue();
        maxValue = range.maxValue();
    }

    @Override
    public boolean isValid(Integer field, ConstraintValidatorContext ctx) {

        if (field < minValue || field > maxValue) {
            return false;
        }

        return true;
    }

}