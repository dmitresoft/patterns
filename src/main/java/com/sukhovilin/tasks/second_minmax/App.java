package com.sukhovilin.tasks.second_minmax;

public class App {

    public static void main(String[] args) {
        new App().min();
        new App().max();
    }

    private void min() {
        int[] array = {10, 7, 8, 1, 8, 7, 6};
        int min1 = Integer.MAX_VALUE, min2 = Integer.MIN_VALUE;
        for (int i : array) {
            if (i < min1) {
                min2 = min1;
                min1 = i;
            } else if (i < min2) min2 = i;
        }
        System.out.println(min1);
        System.out.println(min2);
    }

    private void max() {
        int[] array = {10, 7, 8, 1, 8, 7, 6};
        int high1 = Integer.MIN_VALUE;
        int high2 = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > high1) {
                high2 = high1;
                high1 = num;
            } else if (num > high2) {
                high2 = num;
            }
        }
        System.out.println(high1);
        System.out.println(high2);
    }

}
