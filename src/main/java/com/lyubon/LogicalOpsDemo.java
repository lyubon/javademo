package com.lyubon;

public class LogicalOpsDemo {
    public static void main(String[] args) {
        boolean t = true;
        if (t) {
            System.out.println("true");
        }

        boolean f = false;
        if (f) {
            System.out.println("false");
        }



        // &&, ||, !
        int bottles = 10;

        // [5, 15]
        // 10 => 5 = true
        // 10 <= 15 = true
        // true && true = true
        boolean r1 = bottles >= 5 && bottles <= 15; // logical AND
        System.out.println("[5, 15] = " + r1);

        // 5, 6, 7
        // 10 == 5 = false
        // 10 == 6 = false
        // 10 == 7 = false
        // (false || false) || false -> false || false = false
        boolean r2 = bottles == 5 || bottles == 6 || bottles == 7; // logical OR
        System.out.println("{ 5, 6, 7 } = " + r2);

        boolean r3 = !r2; // logical NOT
        boolean af = !true;

        System.out.println("r3 = " + r3);
    }
}
