package org.validator.annotations;

import org.validator.constraintValidator.NotEmptyConstraintValidator;
import org.validator.constraintValidator.NotNullConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by sabir.salman on 2/17/15.
 */
@Documented
@Constraint(validatedBy = {NotEmptyConstraintValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotEmpty {

    String message() default "FIELD CANNOT BE EMPTY";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
