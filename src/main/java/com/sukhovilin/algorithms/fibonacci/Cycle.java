package com.sukhovilin.algorithms.fibonacci;

public class Cycle {

    public static void main(String[] args) {
        new Cycle().go();
    }

    private void go() {

        System.out.println(fib(13));
        long start = System.nanoTime();
        System.out.println(fib(50));
        System.out.println("t: " + (System.nanoTime() - start));

    }

    private long fib(int n) {
        long a = 0, x1 = 0, x2 = 1;
        for (int i = 2; i <= n; i++) {
            a = x1 + x2;
            x1 = x2;
            x2 = a;
        }
        return a;
    }

}
