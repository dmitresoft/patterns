package com.sukhovilin.algorithms.recursion;

public class Fibonacci {

    public static void main(String[] args) {
        for (int i = 0; i <= 44; ++i) {
            long start = System.currentTimeMillis();
            long fib = fib(i);
            System.out.println("fib(" + i + ") = " + fib + "\t" + (System.currentTimeMillis() - start));
        }
    }

    private static long fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

}
