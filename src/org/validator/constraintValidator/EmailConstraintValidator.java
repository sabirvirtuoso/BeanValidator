package org.validator.constraintValidator;

/**
 * Created by sabir.salman on 2/17/15.
 */

import org.validator.annotations.Email;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailConstraintValidator implements ConstraintValidator<Email, String> {

    private static final String VALID_EMAIL_REGEX_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    @Override
    public void initialize(Email email) {
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext ctx) {

        if (!email.matches(VALID_EMAIL_REGEX_PATTERN)) {
            return false;
        }

        return true;
    }

}
