package com.NumberGenerator.Program;
import java.util.Random;

public class RandomNubmerPoland {

    public static void randomEra(){

        String[] texts = {"+48600", "+48602", "+48604", "+48606", "+48608", "+48660",
                "+48662", "+48664", "+48668", "+48692", "+48694", "+48696", "+48698",
                "+48787", "+48788", "+48880", "+48886", "+48888", "+48889"};
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
    public static void randomOrange(){

        String[] texts = {"+4850", "+48510", "+48511", "+48512", "+48513", "+48514",
                "+48515", "+48516", "+48517", "+48690", "+48780", "+48789", "+48799"};
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
    public static void randomPlusLycamobile(){

        String[] texts = {"+48601", "+48603", "+48605", "+48607", "+48609", "+48661",
                "+48663", "+48665", "+48667", "+48669", "+48691", "+48693", "+48695",
                "+48697", "+48781", "+48783", "+48785", "+48885", "+48887"};
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