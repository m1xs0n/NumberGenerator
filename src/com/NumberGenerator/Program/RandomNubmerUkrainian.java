package com.NumberGenerator.Program;
import java.util.Random;

public class RandomNubmerUkrainian {

   public static void randomKuivstar(){

        String[] texts = {"+38039", "+38067", "+38068", "+38098", "+38096", "+38097"};
        Random random = new Random();

        for (int i = 0; i < 1; i++) {
            int pos = random.nextInt(texts.length);
            if (i % 10 == 0) {
                System.out.print(texts[pos]);
            } else {
                System.out.print(texts[pos]);
            }
        }
    }
    public static void randomVodafon(){

        String[] texts = {"+38050", "+38066", "+38095", "+38099"};
        Random random = new Random();

        for (int i = 0; i < 1; i++) {
            int pos = random.nextInt(texts.length);
            if (i % 10 == 0) {
                System.out.print(texts[pos]);
            } else {
                System.out.print(texts[pos]);
            }
        }
    }
    public static void randomLifecell(){

        String[] texts = {"+38063", "+38073", "+38093"};
        Random random = new Random();

        for (int i = 0; i < 1; i++) {
            int pos = random.nextInt(texts.length);
            if (i % 10 == 0) {
                System.out.print(texts[pos]);
            } else {
                System.out.print(texts[pos]);
            }
        }
    }
}
