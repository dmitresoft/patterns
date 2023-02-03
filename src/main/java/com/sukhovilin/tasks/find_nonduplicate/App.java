package com.sukhovilin.tasks.find_nonduplicate;

/**
 * Find a number which has no duplicate.
 * Yandex.
 */
public class App {

    public static void main(String[] args) {
        int[] arr = {9, 1, 2, 7, 5, 1, 7, 9, 2};

        System.out.println("case 1"); // O(n2)
        new App().case1(arr);

        System.out.println("case 2"); // O(n)
        new App().case2(arr);

    }

    private void case1(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        flag = false;
                    }
                }
            }
            if (flag) {
                System.out.println(arr[i]);
            }

        }

    }

    private void case2(int[] arr) {
        int r = 0;
        for (int i : arr) {
            r ^= i;
        }
        System.out.println(r);
    }

}
