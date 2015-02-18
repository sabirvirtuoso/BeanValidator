package org.validator.constraintValidator;

/**
 * Created by sabir.salman on 2/17/15.
 */

import org.validator.annotations.LoginUsername;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LoginUsernameConstraintValidator implements ConstraintValidator<LoginUsername, String> {

    private static final String VALID_USERNAME_REGEX_PATTERN = "^[a-zA-z0-9_\\.-]+$";

    @Override
    public void initialize(LoginUsername userName) {
    }

    @Override
    public boolean isValid(String userName, ConstraintValidatorContext ctx) {

        if (!userName.matches(VALID_USERNAME_REGEX_PATTERN)) {
            return false;
        }

        return true;
    }

}
