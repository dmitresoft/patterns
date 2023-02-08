package com.sukhovilin.interview;

import java.util.*;

public class App {

    public static void main(String[] args) {
        //new App().go16();

    }

    public static int add(int a, int b) {
        if (b == 0) return a;
        int sum = a ^ b;      // добавляем без переноса
        int carry = (a & b) << 1;  // перенос без суммирования
        return add(sum, carry);    // рекурсия
    }

    private void go12() {
        int[] array = {10, 7, 8, 1, 8, 7, 6};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) continue;
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    i = array.length;
                    break;
                }
            }
        }
        //System.out.println("Index of a local minima is " + localMin(arr, arr.length));
    }



    private void go10() {
        String str = "analogy";
        byte[] bs = str.getBytes();

        for (int i = 0; i < bs.length; i++) {

            boolean rep = false;
            for (int j = i; j < bs.length; j++) {
                if (j != i) {
                    if (bs[i] == bs[j]) {
                        rep = true;
                    }
                }
            }
            if (!rep) {
                System.out.println(new String(new byte[]{bs[i]}));
                break;
            }


        }

    }

    private void go8() {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};

        int r = profit(arr, 0, 0);
        System.out.println(r);

    }

    private int profit(int[] arr, int start, int profit) {
        if (start == arr.length) return profit;
        for (int i = start; i < arr.length; i++) {
            int x = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int y = arr[j];
                if ((x + y) > profit) {
                    profit = x + y;
                }
            }
        }
        return profit(arr, start + 1, profit);
    }

    private void go6() {
        int[] arr = {1, 5, 7, 2, 7, 5, 2, 5};
        for (int x : arr) {
            int count = 0;
            for (int j : arr) {
                if (x == j) count++;
            }
            if (count % 2 != 0) {
                System.out.println(x);
                break;
            }

        }

    }

    private void go4() {
        List<Integer> list1 = new ArrayList<>(List.of(7, 8, 2, 7, 8));
        List<Integer> list2 = new ArrayList<>(List.of(7, 8, 2, 8, 7));
        System.out.println(check(list1));
        System.out.println(check(list2));

    }

    private boolean check(List<Integer> list) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(list);
        for (int x : list) {
            if (x != stack.pop()) return false;
        }
        return true;
    }

    private void go3() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        var it1 = list.iterator();
        var it2 = list.iterator();

        for (int i = 0; i < 3; i++) it1.next();

        int candidate;
        while (it1.hasNext()) {
            it1.next();
            it2.next();
        }
        candidate = it2.next();
        System.out.println(candidate);
    }

    private void go2() {

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));

        int candidate = -1;
        for (int i = 0; i < 3; i++) {
            var it = list.iterator();
            while (it.hasNext()) {
                candidate = it.next();
            }
            it.remove();
        }

        System.out.println(candidate);
        System.out.println(list);

    }

}
