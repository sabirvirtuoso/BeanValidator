package org.validator.beans;

import org.validator.annotations.LoginPassword;
import org.validator.annotations.LoginUsername;
import org.validator.annotations.StringRange;

/**
 * Created by sabir.salman on 2/17/15.
 */
public class LoginCredentials {

    @LoginUsername
    @StringRange(minLength = 5, maxLength = 20, message = "USERNAME NOT WITHIN 5 TO 20 CHARACTERS")
    private String userName;

    @LoginPassword(message = "PASSWORD SHOULD HAVE AT LEAST ONE SMALL AND " +
            "CAPITAL LETTER, A DIGIT AND A SPECIAL CHARACTER (@, #, $, %)")
    @StringRange(minLength = 6, maxLength = 20, message = "PASSWORD SHOULD BE WITHIN 6 TO 20 CHARACTERS")
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
