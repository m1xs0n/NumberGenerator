package com.NumberGenerator.RegistrationAndAuthorazation;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.NumberGenerator.RegistrationAndAuthorazation.UserPasswordValidation;
import com.google.common.hash.Hashing;


public class Registration {
    public static boolean registration(String login, String password) {
        if (!UserPasswordValidation.isValidPassword(password, login)) {
            return false;
        }
        String sha256hex = Hashing.sha256()
                .hashString(password, StandardCharsets.UTF_8)
                .toString();
        User newUser = new User(login, sha256hex);
        Recording.writeUserInfo(newUser);
        return true;
    }
}