package com.sukhovilin.tasks.array_minmax;

public class App {

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 9};
        System.out.println("min: " + new App().min(arr));
        System.out.println("max: " + new App().max(arr));
    }

    private int min(int[] arr) {
        int res = arr[0];
        for (int x : arr) {
            if (x < res) res = x;
        }
        return res;
    }

    private int max(int[] arr) {
        int res = arr[0];
        for (int x : arr) {
            if (x > res) res = x;
        }
        return res;
    }

}
