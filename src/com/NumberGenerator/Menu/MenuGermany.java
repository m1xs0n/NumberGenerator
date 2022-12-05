package com.NumberGenerator.Menu;

import java.util.Scanner;
import com.NumberGenerator.Program.RandomNubmerGermany;
import com.NumberGenerator.Program.RandomNumber;

public class MenuGermany {
    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Генерувати номер для Германії! " +
                        "Виберіть оператора : ");
    }

    public static void menu() {

        String[] options = {"",
                "1- Генерувати для E-Plus.",
                "2- Генерувати для Vodafone.",
                "3- Генерувати для T-Mobile.",
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

    // Опції
    private static void option1(){
        RandomNubmerGermany.randomEPlus();
        RandomNumber.random();
    }

    private static void option2() {
        RandomNubmerGermany.randomVodafon();
        RandomNumber.random();
    }

    private static void option3() {
        RandomNubmerGermany.randomTMobile();
        RandomNumber.random();
    }

    private static void option4() {

    }

}