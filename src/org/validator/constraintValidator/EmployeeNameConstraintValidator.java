package org.validator.constraintValidator;

import org.validator.annotations.EmployeeName;
import org.validator.annotations.LoginUsername;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmployeeNameConstraintValidator implements ConstraintValidator<EmployeeName, String> {

    private static final String VALID_NAME_REGEX_PATTERN = "^[a-zA-z\\s]+$";

    @Override
    public void initialize(EmployeeName name) {
    }

    @Override
    public boolean isValid(String name, ConstraintValidatorContext ctx) {

        if (!name.matches(VALID_NAME_REGEX_PATTERN)) {
            return false;
        }

        return true;
    }

}
