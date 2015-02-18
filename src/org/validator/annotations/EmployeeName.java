package org.validator.annotations;

import org.validator.constraintValidator.EmployeeNameConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by sabir.salman on 2/17/15.
 */
@Documented
@Constraint(validatedBy = {EmployeeNameConstraintValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface EmployeeName {

    String message() default "INVALID NAME";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}