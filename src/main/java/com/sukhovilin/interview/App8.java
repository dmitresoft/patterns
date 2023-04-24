package com.sukhovilin.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class App8 {

    public static void main(String[] args) {
        new App8().go1();
    }

    long cnt;

    private void go() {

        int[] arr = {1, 2, 33, 4, 5, 4, 3, 2, 1};
        System.out.println("len = " + arr.length);
        int[] m = new int[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {
            m[i - 1] = arr[i - 1] - arr[i];
        }
        System.out.println(Arrays.toString(m));
        int s = 0;
        for (int j : m) {
            s += j;
        }
        System.out.println("s = " + s);


    }

    private void go1() {

        cnt = 0;
        System.out.println("fib " + fib(34));
        System.out.println("cnt " + cnt);

        cnt = 0;
        System.out.println("fib " + fib2(34));
        System.out.println("cnt " + cnt);

        cnt = 0;
        System.out.println("fib " + fib(5));
        System.out.println("cnt " + cnt);

        System.out.println(Arrays.toString(cache));
//        for (int i = 0; i <= 50; i++) {
//            var a = fib(i);
//            System.out.println("fib(" + i + ") = " + a);
//        }
    }

    long[] cache = new long[100];

    long fib(long n) {
        if (n <= 1) return n;
        if (cache[(int) n] == 0) {
            cnt++;
            cache[(int) n] = fib(n - 1) + fib(n - 2);
        }
        return cache[(int) n];
    }

    long fib2(long n) {
        if (n <= 1) return n;
        cnt++;
        return fib2(n - 1) + fib2(n - 2);
    }

}
