package org.validator.constraintValidator;

/**
 * Created by sabir.salman on 2/17/15.
 */

import org.validator.annotations.NotNull;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotNullConstraintValidator implements ConstraintValidator<NotNull, Object> {

    @Override
    public void initialize(NotNull field) {
    }

    @Override
    public boolean isValid(Object field, ConstraintValidatorContext ctx) {

        if (field == null) {
            return false;
        }

        return true;
    }

}
