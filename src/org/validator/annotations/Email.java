package org.validator.annotations;

import org.validator.constraintValidator.EmailConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by sabir.salman on 2/17/15.
 */
@Documented
@Constraint(validatedBy = {EmailConstraintValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Email {

    String message() default "INVALID EMAIL FORMAT";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}