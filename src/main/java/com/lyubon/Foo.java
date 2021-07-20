package com.lyubon;

import java.util.Random;

import static java.lang.System.out;

public class Foo {
    public static void main(String[] args) {
        String str = "hello";
        String[] arr = { "bye", "hola", "ok", str, "foo", "bar" };

        out.println("arr length: " + arr.length);

        Random randomGenerator = new Random();

        double rand = Math.random();
        int randIndex = (int)(rand * arr.length);

        int randIndex2 = randomGenerator.nextInt(arr.length);

        out.println("random index: " + randIndex);
        out.println("random index 2: " + randIndex2);

        int index = 0;
        String randElement = arr[randIndex2];
        out.println("random element: " + randElement);
    }
}
