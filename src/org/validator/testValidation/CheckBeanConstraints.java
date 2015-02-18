package org.validator.testValidation;

import org.validator.beans.Employee;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.lang.reflect.Field;
import java.util.Set;

/**
 * Created by sabir.salman on 2/18/15.
 */
public class CheckBeanConstraints {

    public void checkConstraints(Object obj) throws IllegalAccessException {
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field f : fields) {
            f.setAccessible(true);
            if (!f.getType().isPrimitive()) {
                //System.out.println("Not Primitive");
                checkConstraints(f.get(obj));
            }
        }

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<Object>> objectConstraints = validator
                .validate(obj);


        for (ConstraintViolation<Object> constraint : objectConstraints) {

            System.out.println(constraint.getPropertyPath() + " " + constraint.getMessage());
        }

    }
}
