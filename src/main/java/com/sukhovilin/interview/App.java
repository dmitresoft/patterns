package com.sukhovilin.interview;

import java.util.*;

public class App {

    public static void main(String[] args) {
        new App().go16();
    }

    private void go16() {

        String s = "Java"+1+2+"Quiz"+""+(3+4);
        System.out.println(s);

        List<Integer> ints = List.of(1, 3, 5, 7, 9, 10, 23);

        Random r = new Random();
        Iterator<Integer> it = ints.iterator();

        int x =0;
        int i =0;
        while (it.hasNext()){
            i++;

            System.out.println(it.next());

        }


    }


    private int count2(int n) {
        int result = 0;
        while (n > 0) {
            if (n % 10 == 2) result++;
            n = n / 10;
        }
        return result;
    }

    public static int add(int a, int b) {
        if (b == 0) return a;
        int sum = a ^ b;      // добавляем без переноса
        int carry = (a & b) << 1;  // перенос без суммирования
        return add(sum, carry);    // рекурсия
    }

    private void go14() {

        int a = 4;
        int b = 5;


        int k = sign(a - b);
        int q = flip(k);

        int r = a * k + b * q;
        System.out.println(r);

    }

    int flip(int a) {
        return 1 ^ a;
    }

    int sign(int a) {
        return flip(a) & 0x1;
    }

//    int sign1(int a) {
//        return (a & 0x1) ^ 1;
//    }


    private void SECOND_MIN() {
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

    private void go13() {
        int[] S = {1, 2, 1};
        findPowerSet(S);
    }

    public static void findPowerSet(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length * arr.length;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n; i++) { // генерируем каждое подмножество одно за другим
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(arr[j]);
                }
            }
            set.add(subset);
        }
        System.out.println(set);
    }

    int secondHighest(int... nums) {
        int high1 = Integer.MIN_VALUE;
        int high2 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > high1) {
                high2 = high1;
                high1 = num;
            } else if (num > high2) {
                high2 = num;
            }
        }
        return high2;
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

    private void LOCAL_MIN(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if ((arr[i] < arr[i - 1]) && (arr[i] < arr[i + 1])) {
                System.out.println("index=" + i + " value=" + arr[i]);
            }
        }
    }

    private void min1(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += arr[j];
            }
            if (sum < arr[i]) System.out.println(arr[i]);
        }

    }

    public int localMin(int[] arr, int n) {
        return localMinUtil(arr, 0, n - 1, n);
    }

    public int localMinUtil(int[] arr, int low, int high, int n) {
        int mid = low + (high - low) / 2;
        // Compare middle element with its neighbours
        // (if neighbours exist)
        if (mid == 0 || arr[mid - 1] > arr[mid] && mid == n - 1 ||
                arr[mid] < arr[mid + 1])
            return mid;

            // If middle element is not minima and its left
            // neighbour is smaller than it, then left half
            // must have a local minima.
        else if (mid > 0 && arr[mid - 1] < arr[mid])
            return localMinUtil(arr, low, mid - 1, n);

        // If middle element is not minima and its right
        // neighbour is smaller than it, then right half
        // must have a local minima.
        return localMinUtil(arr, mid + 1, high, n);
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
