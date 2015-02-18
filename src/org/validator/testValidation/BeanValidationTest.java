package org.validator.testValidation;

import org.validator.beans.Employee;
import org.validator.beans.LoginCredentials;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import java.lang.reflect.Field;
import java.util.Set;

/**
 * Created by sabir.salman on 2/17/15.
 */
public class BeanValidationTest {

    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException {
        Employee emp = new Employee();
        emp.setFullName("sabir");
        emp.setAge(20);
        emp.setEmail("sabir.salman@therapservices.net");
        emp.setPhone("+8801734567892");
        emp.setDateOfBirth("2012-12-12");

        LoginCredentials empCred = new LoginCredentials();
        empCred.setUserName("sabir.salman");
        empCred.setPassword("ther@P123");

        emp.setUserLoginCredentials(empCred);

        new CheckBeanConstraints().checkConstraints(emp);

    }


}
