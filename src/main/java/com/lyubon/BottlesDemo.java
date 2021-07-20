package com.lyubon;

public class BottlesDemo {
    public static void main(String[] args) {
        // 11 бутылок
        // 1 бутылка
        // 3 бутылки

        int bottles = 99;
        while (bottles >= 0) {
            String w = word(bottles);

            System.out.println(bottles + " " + w);

            bottles = bottles - 1;
        }

    }

    private static String word(int bottles) {
        // 2'1' % 10 = 1 ( ''1 % 10 = 1 )
        int remainder = bottles % 10;

        // 1 бутылка
        // 21 бутылка
        // 31 бутылка
        // 11 бутылок ***

        // 1'4'

        // esli ostatok 1 i chislo ne 11
        if (remainder == 1 && (bottles != 11)) {
            return "бутылка";
        } else if (remainder >= 2 && remainder <= 4 && !(bottles >= 12 && bottles <= 14)) {
            // '3' бутылки
            // '2' бутылки
            // 1'2' бутылки -> бутылок [12, 13, 14]
            // [2, 4]
            // 2'2' бутылки
            // 2'3' бутылки
            // 2'4' бутылки
            // 25 бутылок
            return "бутылки";
        } else {
            return "бутылок";
        }
    }
}
