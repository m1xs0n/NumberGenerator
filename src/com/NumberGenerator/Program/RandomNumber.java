package com.NumberGenerator.Program;

import java.io.*;
import java.lang.Math;

public class RandomNumber {


    public static void random() {

        int max = 999999;
        int min = 100000;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        for (int i = 0; i < 1; i++) {
            System.out.print(rand);
        }

    }
    public static void random(int rand) {

        int max = 999999;
        int min = 100000;
        int range = max - min + 1;
        rand = (int) (Math.random() * range) + min;
        try (FileWriter writer = new FileWriter("history.txt", true)) {
            String text = rand + "";
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


