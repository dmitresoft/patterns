package com.sukhovilin.tasks.array_leader;

public class App {

    public static void main(String[] args) {
    new App().go();
    }

    private void go() { // leader
        int[] arr = {14, 12, 70, 15, 99, 65, 21, 90};
        for (int i = 0; i < arr.length; i++) {
            int candidate = arr[i];
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (candidate <= arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(candidate);
            }
        }
    }

}
