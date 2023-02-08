package com.sukhovilin.tasks.find_skipped_value;

public class App {

    public static void main(String[] args) {
        new App().go();
    }

    private void go() {
        int[] a = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        int s1 = 0;
        for (int i : a) {
            s1 += i;
        }
        int s2 = 0;
        for (int i = 0; i <= 10; i++) { // s2 = 10 * (10 + 1) / 2;
            s2 += i;
        }
        System.out.println(s2 - s1);
    }

}
