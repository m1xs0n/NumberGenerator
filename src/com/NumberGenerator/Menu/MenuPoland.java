package com.NumberGenerator.Menu;

import java.util.Scanner;
import com.NumberGenerator.Program.RandomNubmerPoland;
import com.NumberGenerator.Program.RandomNumber;

public class MenuPoland {
    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Генерувати номер для Польщі! " +
                "Виберіть оператора : ");
    }

    public static void menu() {

        String[] options = {"",
                "1- Генерувати для Era.",
                "2- Генерувати для Orange.",
                "3- Генерувати для Plus-Lycamobile.",
                "4- Повернутися.❌",
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

    private static void option1(){
        RandomNubmerPoland.randomEra();
        RandomNumber.random();
    }

    private static void option2() {
        RandomNubmerPoland.randomOrange();
        RandomNumber.random();
    }

    private static void option3() {
        RandomNubmerPoland.randomPlusLycamobile();
        RandomNumber.random();
    }

    private static void option4() {

    }
}