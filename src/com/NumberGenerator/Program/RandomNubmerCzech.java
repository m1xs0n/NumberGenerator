package com.NumberGenerator.Program;
import java.util.Random;

public class RandomNubmerCzech {

    public static void randomTMobile(){

    String[] texts = {"+42073", "+420603", "+420604", "+420605"};
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
    public static void randomO2(){

        String[] texts = {"+42072", "+420601", "+420602", "+420606", "+420607"};
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
    public static void randomVodafone(){

        String[] texts = {"+42077", "+420608"};
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


