package com.NumberGenerator.Menu;

import com.NumberGenerator.RegistrationAndAuthorazation.Authorization;
import com.NumberGenerator.RegistrationAndAuthorazation.Registration;
import com.NumberGenerator.RegistrationAndAuthorazation.UserPasswordValidation;
import com.NumberGenerator.RegistrationAndAuthorazation.User;
import java.util.Scanner;

public class Menu {



    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Ласкаво Просимо" +
                "Виберіть опцію : ");
    }

    public static void menu() {
        //Меню опцій
        String[] options = {"",
                "1- Авторизація;",
                "2- Реєстрація;",
                "3- Гість.",
                "4- Вихід❌",
                ""
        };
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 4) {
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        option1();
                        break;
                    case 2:
                        option2();
                        break;
                    case 3:
                        option3();
                        break;
                    case 4:
                        option4();
                }
            } catch (Exception ex) {
                System.out.println("Немає такої опції!" +
                                    "Ви можете вибирати опції тільки від 1 до 4!");
                scanner.next();
            }
        }
    }

    // Опції
    private static void option1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть логін: ");
        String login = scanner.nextLine();
        System.out.println("Введіть пароль: ");
        String password = scanner.nextLine();

        String admin = "adminMisha";
        String adminPassword = "Misha#3000";
        if(login.equals(admin) && password.equals(adminPassword)){
            AdminMenu.menu();
        }

        if (!Authorization.authorizationProcess(login, password)){
            System.out.println("Ви ввели неправильні дані!");
        }
        else {
            MainMenu.menu();
        }
    }

    private static void option2() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть логін: ");
        String login = scanner.nextLine();
        System.out.println("Введіть пароль: ");
        String password = scanner.next();
        if (!Registration.registration(login, password)){
            System.out.println(String.join("\n", "Помилка!",
                    "Увага пароль повинен:",
                    "- Містити латинські букви",
                    "- Містити цифри",
                    "- Містити хоча б одну велику літеру і маленьку",
                    "- Містити хоча б один символ з цих:[@#$%^&+=]"));
        }else{
            MainMenu.menu();
        }
    }
    private static void option3() {
        MainMenu.menu();
    }


    private static void option4() {
        System.out.println("До зустрічі!");



    }

}
