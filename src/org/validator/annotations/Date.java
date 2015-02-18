package org.validator.annotations;

import org.validator.constraintValidator.DateConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by sabir.salman on 2/17/15.
 */
@Documented
@Constraint(validatedBy = {DateConstraintValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Date {

    String message() default "INVALID DATE FORMAT";

    String format() default "yyyy-MM-dd";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
