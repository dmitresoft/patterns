package com.sukhovilin.tasks.my_linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class PerformanceApp {

    public static void main(String[] args) {
        int lim = 1_000_000;
        new PerformanceApp().go3(lim);
        new PerformanceApp().go2(lim);
        new PerformanceApp().go1(lim);
    }

    private void go3(int lim) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < lim; i++) {
            list.add(10);
        }

        long start = System.nanoTime();
        long sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println(sum + " arr time " + (System.nanoTime() - start));
    }


    private void go1(int lim) {

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < lim; i++) {
            list.add(10);
        }

        long start = System.nanoTime();
        long sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println(sum + " lnk time " + (System.nanoTime() - start));

    }

    private void go2(int lim) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        for (int i = 0; i < lim; i++) {
            list.add(10);
        }

        long start = System.nanoTime();
        long sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println(sum + "  my time " + (System.nanoTime() - start));
    }

    class MyLinkedList<T> implements Iterable<T> {

        private MyListItem<T> first;
        private MyListItem<T> last;

        public MyLinkedList<T> add(T value) {

            MyListItem<T> item = new MyListItem<>(value);

            if (first == null)
                first = item;
            else
                last.next = item;

            last = item;

            return this;

        }

        @Override
        public Iterator<T> iterator() {
            return new Iterator<T>() {

                MyListItem<T> current = first;

                @Override
                public boolean hasNext() {
                    return current != null;
                }

                @Override
                public T next() {
                    T data = current.data;
                    current = current.next;
                    return data;
                }
            };
        }

    } //

    class MyListItem<T> {

        public final T data;
        public MyListItem<T> next;

        public MyListItem(T data) {
            this.data = data;
        }

    }

}