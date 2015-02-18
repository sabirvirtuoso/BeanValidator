package org.validator.annotations;

import org.validator.constraintValidator.LoginPasswordConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by sabir.salman on 2/17/15.
 */
@Documented
@Constraint(validatedBy = {LoginPasswordConstraintValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginPassword {

    String message() default "INVALID PASSWORD FORMAT";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
