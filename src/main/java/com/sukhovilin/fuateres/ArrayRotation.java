package com.sukhovilin.fuateres;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        new ArrayRotation().case1(new int[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println("---------");
        new ArrayRotation().case2(new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    private void case2(int[] ints) { // <--
        System.out.println(Arrays.toString(ints));
        int tmp = ints[0];
        int len = ints.length - 1;
        for (int i = 0; i < len; i++) {
            ints[i] = ints[i + 1];
        }
        ints[len] = tmp;
        System.out.println(Arrays.toString(ints));
    }

    private void case1(int[] ints) { // -->
        System.out.println(Arrays.toString(ints));
        int tmp = ints[ints.length - 1];
        for (int i = ints.length - 1; i > 0; i--) {
            ints[i] = ints[i - 1];
        }
        ints[0] = tmp;
        System.out.println(Arrays.toString(ints));
    }
}
