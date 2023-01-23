package com.sukhovilin.fuateres;

import java.util.LinkedList;
import java.util.List;

public class LinkedListRotation {

    public static void main(String[] args) {
        new LinkedListRotation().case1(new LinkedList<>(List.of(1, 2, 3, 4, 5, 6)));
        System.out.println("------");
        new LinkedListRotation().case2(new LinkedList<>(List.of(1, 2, 3, 4, 5, 6)));
    }

    private void case2(List<Integer> list) { // ->
        System.out.println(list);
        rotate2(list, 2);
        System.out.println(list);
    }

    private void rotate2(List<Integer> list, int n) {
        for (int i = 0; i < n; i++) {
            var item = list.remove(list.size() - 1);
            list.add(0, item);
        }
    }

    private void case1(List<Integer> list) { // <--
        System.out.println(list);
        rotate1(list, 2);
        System.out.println(list);

    }

    private void rotate1(List<Integer> list, int n) {
        for (int i = 0; i < n; i++)
            list.add(list.remove(0));
    }

}
