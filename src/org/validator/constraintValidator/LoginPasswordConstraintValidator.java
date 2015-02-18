package org.validator.constraintValidator;

/**
 * Created by sabir.salman on 2/17/15.
 */
import org.validator.annotations.LoginPassword;
import org.validator.annotations.LoginUsername;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LoginPasswordConstraintValidator implements ConstraintValidator<LoginPassword, String> {

    private static final String VALID_PASSWORD_REGEX_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).+)";

    @Override
    public void initialize(LoginPassword password) { }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext ctx) {

        if(!password.matches(VALID_PASSWORD_REGEX_PATTERN)) {
            return false;
        }

        return true;
    }

}

