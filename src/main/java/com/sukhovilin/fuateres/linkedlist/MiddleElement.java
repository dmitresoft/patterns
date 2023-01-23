package com.sukhovilin.fuateres.linkedlist;

import java.util.Iterator;
import java.util.List;

public class MiddleElement {

    public static void main(String[] args) {
        new MiddleElement().go();
    }

    private void go() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        Integer middle = find(list);
        System.out.println(middle);
    }

    private Integer find(List<Integer> list) {

        boolean flag = false;
        Iterator<Integer> it = list.iterator();
        Integer result = null;

        for (Integer integer : list) {
            flag = !flag;
            if (flag) {
                result = it.next();
            }
        }

        return result;

    }

}
