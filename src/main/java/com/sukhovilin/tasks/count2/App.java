package com.sukhovilin.tasks.count2;

public class App {
    public static void main(String[] args) {
        new App().go();
    }

    private void go() {
        System.out.println(count2(20203));
        System.out.println(count2(2020332));
    }

    private int count2(int n) {
        int result = 0;
        while (n > 0) {
            if (n % 10 == 2) result++;
            n = n / 10;
        }
        return result;
    }

}
