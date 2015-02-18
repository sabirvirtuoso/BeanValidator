package org.validator.annotations;


import org.validator.constraintValidator.LoginUsernameConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by sabir.salman on 2/17/15.
 */
@Documented
@Constraint(validatedBy = {LoginUsernameConstraintValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUsername {

    String message() default "INVALID USERNAME FORMAT";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
