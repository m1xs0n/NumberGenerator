package com.NumberGenerator.Menu;

import java.util.Scanner;
import com.NumberGenerator.Program.RandomNumber;
import com.NumberGenerator.Program.RandomNubmerUkrainian;
public class MenuUkrainian {
    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Генерувати номер для України! " +
                "Виберіть оператора : ");
    }
    public static void menu() {

        String[] options = {"",
                "1- Генерувати для Київстар.",
                "2- Генерувати для Vodafone.",
                "3- Генерувати для Лайселф.",
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
        RandomNubmerUkrainian.randomKuivstar();
        RandomNumber.random();
    }

    private static void option2() {
        RandomNubmerUkrainian.randomVodafon();
        RandomNumber.random();
    }

    private static void option3() {
        RandomNubmerUkrainian.randomLifecell();
        RandomNumber.random();
    }

    private static void option4() {

    }
}