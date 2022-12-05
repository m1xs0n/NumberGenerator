package com.NumberGenerator.RegistrationAndAuthorazation;

import com.NumberGenerator.Menu.AdminMenu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UserInfoReader {

    public static boolean readFile(String login, String hashedPassword) {
        String admin = "adminM1xs0m13!";
        try {
            String fileName = "users.txt";
            Path path = Paths.get(fileName.toString());
            InputStream reader = Files.newInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(reader));
            String line, user, pass;
            while ((line = br.readLine()) != null) {
                String[] account = line.split(",");
                user = account[0];
                pass = account[1];

                if (user.equals(login) && pass.equals(hashedPassword) )
                {if(login == admin){
                    AdminMenu.menu();
                }else {
                    System.out.println("Вітаємо :" + login);
                    return true;}

                }else if (user.equals(login)) {
                    System.out.println("Неправильний логін або пароль");
                    return true;
                }

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Створено файл!");
            try {
                FileWriter fileWriter = new FileWriter("users.txt");
            } catch (IOException e) {
                System.out.println("Помилка при створені файла!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

}
