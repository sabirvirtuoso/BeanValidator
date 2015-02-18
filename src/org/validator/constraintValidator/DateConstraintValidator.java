package org.validator.constraintValidator;

/**
 * Created by sabir.salman on 2/17/15.
 */

import org.validator.annotations.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateConstraintValidator implements ConstraintValidator<Date, String> {

    private String dateFormat;

    @Override
    public void initialize(Date date) {

        dateFormat = date.format();

    }

    @Override
    public boolean isValid(String date, ConstraintValidatorContext ctx) {

        if (!isValidDate(date, dateFormat)) {
            return false;
        }

        return true;
    }

    public boolean isValidDate(String date, String dateFormat) {
        SimpleDateFormat dateFormatt = new SimpleDateFormat(dateFormat);
        dateFormatt.setLenient(false);
        try {
            dateFormatt.parse(date.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }

}
