package com.sukhovilin.interview;

import java.util.*;

public class App8 {

    public static void main(String[] args) {
        new App8().go();
        new App8().go1();
    }

    long cnt;

    private void go() {

        int n = 13;

        long a = 0;
        long x1 = 0, x2 = 1;
        for (int i = 2; i <= n; i++) {
            a = x1 + x2;
            x1 = x2;
            x2 = a;
        }
        System.out.println(a);

    }

    private boolean simple(int n) {
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private void go1() {

        System.out.println(fib(13));

    }

    private int[] compact(int[] arr) {
        return Arrays.stream(arr).filter(x -> x != 0).toArray();
    }

    private long fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }


}
