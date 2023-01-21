package com.sukhovilin.array.search.second_min;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

public class Sample3 {


    public static void main(String[] args) throws Exception {
//        new Sample3().go7();

        Sample3.class.getConstructor().newInstance().go8();

    }


    private void go8() {

        Map<Integer, String> map = Map.of(1, "one", 2, "two");
        var result = map.keySet().stream().map( k -> k + " -> " + map.get(k)).toList();
        System.out.println(result);

    }

    private void go7() {

        ReentrantLock s = new ReentrantLock();


     var a=   new ConcurrentHashMap<>(1000, 0.75f, 2).put(1,2);


        List<Integer> l = new ArrayList<>();
        l.add(2);
        List<Integer> integers = Collections.checkedList(l, Integer.class);
        integers.add(222);
        System.out.println(integers);

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) list.add(i);

        System.out.println(list);
        var it = list.iterator();
        Integer v = null;
        while (it.hasNext()){
            v = it.next();
        }
        it.remove();
        list.add(0, v);
        System.out.println(list);

    }

    private void go6() {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) list.add(i);

        Integer v = null;
        var it = list.iterator();
        while (it.hasNext()) {
            if (v == null) {
                v = it.next();
                it.remove();
            }
            it.next();
        }

        list.add(v);
        System.out.println(list);

    }

    class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }

    static {
        System.out.println("WOW!");
    }


    private void go5() throws InterruptedException {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) list.add(i);

        Stack<Integer> stack = new Stack<>();
        stack.addAll(list);
        list.clear();

        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }

        System.out.println(list);

    }

    private void go4() {

        int step = 2;
        boolean[] arr = {false, false, true, false, false, false, true};

        while (true) {
            boolean res = check(arr, step);
            if (res) {
                break;
            } else {
                step++;
            }
        }
        System.out.println("result " + step);


    }

    private boolean check(boolean[] arr, int step) {
        for (int i = 0; i < arr.length; i += step) {
            if (arr[i]) {
                return false;
            }
        }
        return true;
    }

    private void go3() {

        int[] arr = {9, 5, 4, 9, 10, 11, 10, 6};
        TreeSet<Integer> set = new TreeSet<>();

        int counter = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                counter++;
            } else {
                set.add(counter);
                counter = 1;
            }
        }

        System.out.println(set.last());

    }

    private void go2() {

        int[] arr = {1, 2, 3, 2, 3, 3};

        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.compute(x, (k, v) -> v == null ? 1 : ++v);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int max = list.get(list.size() - 1);
        System.out.println(arr.length - max);


    }

    private int serach(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            int value = a[middle];
            if (value == key) return key;
            if (key > value) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }

    private void go1() {

        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};

        int[] result = new int[a.length + b.length];

        int index = 0;
        for (int i = 0; i < a.length; i++) {
            result[index++] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            result[index++] = b[i];
        }

        Arrays.sort(result);
        System.out.println(Arrays.toString(result));


    }

    void insert(int[] arr, int min, int max, Consumer<Integer> func) {
        for (int x : arr) {
            if ((x > min) && (x < max)) {
                func.accept(x);
            }
        }
    }

    private void go() throws InterruptedException {

        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};

        final int[] first;
        final int[] second;

        if (a[0] < b[0]) {
            first = a;
            second = b;
        } else {
            first = b;
            second = a;
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(first[0]);

        for (int i = 1; i < first.length; i++) {
            insert(second, first[i - 1], first[i], val -> {
                result.add(val);
            });
            result.add(first[i]);

        }
        result.add(first[first.length - 1]);

        System.out.println(result);

    }


}
