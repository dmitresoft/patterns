package com.sukhovilin.tasks.power_set;

import java.util.*;

public class App {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        go(arr);
    }

    private static void go(int[] arr) {
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

}
