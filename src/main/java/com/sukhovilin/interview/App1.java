package com.sukhovilin.interview;

public class App1 {
    public static void main(String[] args) {
        int[] arr = {9, 1, 2, 7, 5, 1, 7, 9, 2};
        int r = 0;
        for (int i : arr) {
            r ^= i;
        }
        System.out.println(r);
    }
}
