package com.sukhovilin.tasks.swap_variables;

/**
 * Swap Variables.
 */
public class App {

    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        System.out.println("case 1 -------");
        new App().case1(a, b);
        System.out.println("case 2 -------");
        new App().case2(a, b);
        System.out.println("case 3 -------");
        new App().case3(a, b);
    }

    private void case1(int a, int b) {
        print(a, b);
        a = a + b;
        b = a - b;
        a = a - b;
        print(a, b);
    }

    private void case2(int a, int b) {
        print(a, b);
        a = a * b;
        b = a / b;
        a = a / b;
        print(a, b);
    }

    /**
     * These XOR properties can be used to swap variables. Let's see how to swap a and b variables:
     */
    private void case3(int a, int b) {
        print(a, b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        print(a, b);
    }

    private void print(int a, int b) {
        System.out.println("a:" + a + ", b:" + b);
    }

}
