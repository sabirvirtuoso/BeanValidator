package org.validator.annotations;

import org.validator.constraintValidator.NumberRangeConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by sabir.salman on 2/17/15.
 */
@Documented
@Constraint(validatedBy = {NumberRangeConstraintValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NumberRange {

    String message() default "VALUE NOT WITHIN SPECIFIED RANGE";

    int minValue() default 1;

    int maxValue() default 100;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}