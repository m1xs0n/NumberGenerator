package com.NumberGenerator.Menu;

import com.NumberGenerator.RegistrationAndAuthorazation.History;

import java.util.Scanner;

public class AdminMenu {


    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Для якої країни ви маєте бажання генерувати номер телефону?" +
                "Виберіть опцію : ");
    }

    public static void menu() {

        String[] options = {"",
                "1- Історія",
                "2- Редагувати історію",
                "3- Редагувати користувачів",
                "4- Про автора",
                "5- Вихід❌",
                ""
        };
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 5) {
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
                        break;
                    case 5:
                        option5();
                }
            } catch (Exception ex) {
                System.out.println("Немає такої опції!" +
                        "Ви можете вибирати опції тільки від 1 до 4!");
                scanner.next();
            }
        }
    }

    private static void option1(){
        History.history();
    }
    private static void option2() {
        MenuCzech.menu();
    }
    private static void option3() {
        MainMenu.menu();
    }
    private static void option4() {
        ProAvtora.avtor();
    }
    private static void option5() {
        System.out.println("До зустрічі!");
    }
}
