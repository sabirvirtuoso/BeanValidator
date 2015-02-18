package org.validator.constraintValidator;

/**
 * Created by sabir.salman on 2/17/15.
 */

import org.validator.annotations.Phone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneConstraintValidator implements ConstraintValidator<Phone, String> {

    private static final String VALID_PHONE_REGEX_PATTERN = "(\\+88)?01[156789][-]?\\d{8}";

    @Override
    public void initialize(Phone phone) {
    }

    @Override
    public boolean isValid(String phoneField, ConstraintValidatorContext ctx) {

        if (!phoneField.matches(VALID_PHONE_REGEX_PATTERN)) {
            return false;
        }

        return true;
    }

}
