package com.sukhovilin.interview;

import java.nio.channels.ClosedByInterruptException;
import java.util.*;

public class App {

    public static void main(String[] args) {
        new App().go12();
    }

    private void go12() {

    }

    private void go11() {


        MyStack2 s = new MyStack2();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());


    }

    class MyStack2 {
        List<Integer> list = new LinkedList<>();
        public void push(Integer x) {
            list.add(x);
        }
        public Integer pop() {
            var it1 = list.iterator();
            var it2 = list.iterator();
            if (it1.hasNext()) it1.next();  // +1
            while (it1.hasNext()) {
                it1.next();
                it2.next();
            }
            Integer result = null;
            if (it2.hasNext()) {
                result = it2.next();
                it2.remove();
            }
            return result;
        }
    }

    class MyStack1 {

        List<Integer> list = new LinkedList<>();

        public void push(Integer x) {
            list.add(0, x);
        }

        public Integer pop() {
            Integer result = null;
            var it = list.iterator();
            if (it.hasNext()) {
                result = it.next();
                it.remove();
            }
            return result;
        }
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

    private void go9() { // SWAP STRING
        byte[] bs = "Hello world".getBytes();
        for (int i = 0; i < bs.length / 2; i++) {
            swap(bs, i, bs.length - i - 1);
        }
        System.out.println(new String(bs));
    }

    static void swap(byte[] arr, int from, int to) {
        var t = arr[from];
        arr[from] = arr[to];
        arr[to] = t;
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

    private void go7() { // leader
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
            if (flag) System.out.println(candidate);
        }
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

    private void go5() {
        int[] a = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        int s1 = 0;
        for (int i : a) {
            s1 += i;
        }
        int s2 = 0;
        for (int i = 0; i <= 10; i++) { //s2 = 10 * (10 + 1) / 2;
            s2 += i;
        }
        System.out.println(s2);
        System.out.println(s2 - s1);
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

    private void go1() { // STACK SORT
        Stack<Integer> stack = new Stack<>();
        stack.addAll(List.of(2, 3, 4, 1, 5));
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()) {
            int tmp = stack.pop();
            while (!help.isEmpty() && help.peek() > tmp) {
                stack.push(help.pop());
            }
            help.push(tmp);
        }
        System.out.println(help);
    }

}
