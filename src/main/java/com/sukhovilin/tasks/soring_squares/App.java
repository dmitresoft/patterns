package com.sukhovilin.tasks.soring_squares;

import java.util.Arrays;

/**
 * Real Deutsche Bank question.
 * Sorting square array.
 */
public class App {

    public static void main(String[] args) {
        int[] arr = {-4, 1, 2, 6, 19};
        System.out.println("case 1");
        new App().case1(arr);
        System.out.println("case 2");
        new App().case2(arr);
    }

    private void case1(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = pow(arr[i]);
        }
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));

    }

    private void case2(int[] arr) {
        int[] ans = new int[arr.length];

        int f = 0;
        int l = arr.length - 1;
        int index = l;

        while (f <= l) {

            int p1 = pow(arr[f]);
            int p2 = pow(arr[l]);

            if (p1 > p2) {
                ans[index--] = p1;
                f++;
            } else {
                ans[index--] = p2;
                l--;
            }


        }

        System.out.println(Arrays.toString(ans));


    }

    private int pow(int val) {
        return val * val;
    }

}
