package com.NumberGenerator.Program;

import java.util.Random;

public class RandomNubmerHungary {

        public static void randomTelenor(){

            String[] texts = {"+3620"};
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
        public static void randomTmobail(){

            String[] texts = {"+3630"};
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

            String[] texts = {"+3670"};
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

