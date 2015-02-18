package org.validator.annotations;

import org.validator.constraintValidator.StringRangeConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by sabir.salman on 2/17/15.
 */
@Documented
@Constraint(validatedBy = {StringRangeConstraintValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface StringRange {

    String message() default "LENGTH NOT WITHIN SPECIFIED RANGE";

    int minLength() default 1;

    int maxLength() default 100;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}