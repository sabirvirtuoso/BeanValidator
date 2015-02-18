package org.validator.annotations;

import org.validator.constraintValidator.NotNullConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by sabir.salman on 2/17/15.
 */
@Documented
@Constraint(validatedBy = {NotNullConstraintValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {

    String message() default "FIELD CANNOT BE NULL";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
