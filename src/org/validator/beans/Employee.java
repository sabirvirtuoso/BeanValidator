package org.validator.beans;

import org.validator.annotations.*;

/**
 * Created by sabir.salman on 2/17/15.
 */
public class Employee {

    @EmployeeName
    @NotEmpty(message = "NAME CANNOT BE EMPTY")
    @StringRange(minLength = 3, maxLength = 10, message = "NAME MUST BE BETWEEN 3 TO 10 CHARACTERS")
    private String fullName;

    @NumberRange(minValue = 10, maxValue = 40, message = "YOUR AGE CANNOT BE OUT OF SPECIFIED RANGE 10-40")
    private int age;

    @Email
    @NotEmpty(message = "EMAIL CANNOT BE EMPTY")
    private String email;

    @Date
    private String dateOfBirth;

    @Phone
    @NotEmpty(message = "PHONE NUMBER MUST BE PROVIDED")
    private String phone;

    private LoginCredentials userLoginCredentials;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LoginCredentials getUserLoginCredentials() {
        return userLoginCredentials;
    }

    public void setUserLoginCredentials(LoginCredentials userLoginCredentials) {
        this.userLoginCredentials = userLoginCredentials;
    }


}
