package com.sukhovilin.array.search.second_min;

public class Sample1 {

    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 7, 2, 9, 12, 2};

        int min = arr[0];
        for (int el : arr) { // first min
            if (el < min) min = el;
        }

        System.out.println("first: " + min);

        int sec = min + 1; // hack :)
        for (int el : arr) { // second min
            if (el != min) {
                if (el < sec) sec = el;
            }
        }

        System.out.println("second: " + sec);

    }

}
