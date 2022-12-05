package com.NumberGenerator.RegistrationAndAuthorazation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserPasswordValidation {
    public static boolean isValidPassword(String password, String login)
    {
        if (password.length() < 8 || login.length() < 4) {
            System.out.println("Пароль повинен бути більшим на 8 символів" +
                                "Логін повинен бути більшим на 4 символів");
            return false;
        }
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        return m.matches();

    }


}