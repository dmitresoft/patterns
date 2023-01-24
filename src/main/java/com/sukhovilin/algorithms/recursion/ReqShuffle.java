package com.sukhovilin.algorithms.recursion;

import java.util.Arrays;

public class ReqShuffle {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        req_shuffle(arr.length, arr);
    }

static void req_shuffle(int n, int[] arr) {
    if (n == 1) {
        System.out.println(Arrays.toString(arr));
    } else {
        for (int i = 0; i < n - 1; i++) {
            req_shuffle(n - 1, arr);
            if (n % 2 == 0) {
                swap(arr, i, n - 1);
            } else {
                swap(arr, 0, n - 1);
            }
        }
        req_shuffle(n - 1, arr);
    }
}

    static void swap(int[] arr, int from, int to) {
        int t = arr[from];
        arr[from] = arr[to];
        arr[to] = t;
    }

}
