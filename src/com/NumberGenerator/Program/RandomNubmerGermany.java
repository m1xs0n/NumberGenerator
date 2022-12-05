package com.NumberGenerator.Program;
import java.util.Random;

public class RandomNubmerGermany {

    public static void randomEPlus(){

        String[] texts = {"+49155", "+491570", "+49163", "+49177", "+49178"};
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

        String[] texts = {"+49152", "+49173", "+49162", "+49172", "+49174"};
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
    public static void randomTMobile(){

        String[] texts = {"+49151", "+49160", "+49170", "+49171", "+49175"};
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