package org.validator.annotations;

import org.validator.constraintValidator.PhoneConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by sabir.salman on 2/17/15.
 */
@Documented
@Constraint(validatedBy = {PhoneConstraintValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {

    String message() default "INVALID MOBILE PHONE NUMBER";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
