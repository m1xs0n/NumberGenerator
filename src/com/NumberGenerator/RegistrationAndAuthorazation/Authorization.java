package com.NumberGenerator.RegistrationAndAuthorazation;

import com.google.common.hash.Hashing;
import java.nio.charset.StandardCharsets;

public class Authorization {

    public static boolean authorizationProcess(String login, String password) {

            String hashedPassword = Hashing.sha256().hashString(password, StandardCharsets.UTF_8).toString();
            if (!UserInfoReader.readFile(login, hashedPassword)) {
                return false;
            }

            return true;
        }
    }
