package com.NumberGenerator.Menu;

import com.NumberGenerator.RegistrationAndAuthorazation.History;

import java.util.Scanner;

public class MainMenu {
    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Для якої країни ви маєте бажання генерувати номер телефону?" +
                "Виберіть опцію : ");
    }

    public static void menu() {

        String[] options = {"",
                "1- Генерувати для України",
                "2- Генерувати для Чехії",
                "3- Генерувати для Германії",
                "4- Генерувати для Польщі",
                "5- Генерувати для Угорщини",
                "6- Історія",
                "7- Вихід❌",
                ""
        };
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 7) {
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
                        break;
                    case 6:
                        option6();
                        break;
                    case 7:
                        option7();
                }
            } catch (Exception ex) {
                System.out.println("Немає такої опції!" +
                        "Ви можете вибирати опції тільки від 1 до 4!");
                scanner.next();
            }
        }
    }

    private static void option1(){
        MenuUkrainian.menu();
    }
    private static void option2() {
        MenuCzech.menu();
    }
    private static void option3() {
        MenuGermany.menu();
    }
    private static void option4() {
        MenuPoland.menu();
    }
    private static void option5() {
        MenuHungary.menu();
    }
    private static void option6() {
        History.history();
    }
    private static void option7() {
        System.out.println("До зустрічі!");
    }

}