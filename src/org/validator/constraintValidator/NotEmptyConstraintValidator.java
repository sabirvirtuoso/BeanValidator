package org.validator.constraintValidator;

/**
 * Created by sabir.salman on 2/17/15.
 */

import org.validator.annotations.NotEmpty;
import org.validator.annotations.NotNull;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotEmptyConstraintValidator implements ConstraintValidator<NotEmpty, String> {

    @Override
    public void initialize(NotEmpty field) {
    }

    @Override
    public boolean isValid(String field, ConstraintValidatorContext ctx) {

        if (field.length() == 0) {
            return false;
        }

        return true;
    }

}
