package com.sukhovilin.tasks.my_linkedlist;

import java.lang.reflect.Array;
import java.nio.channels.Pipe;
import java.util.*;

public class PerformanceApp {

    public static void main(String[] args) {
        int lim = 1_000_000;
        new PerformanceApp().go5(lim);
        new PerformanceApp().go4(lim);
        new PerformanceApp().go3(lim);
        new PerformanceApp().go2(lim);
        new PerformanceApp().go1(lim);
    }

    private void go5(int lim) {

        MyArr<Integer> list = new MyArr<>();

        for (int i = 0; i < lim; i++) {
            list.add(i);
        }

        long start = System.nanoTime();
        long sum = 0;

        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println(sum + " mya time " + (System.nanoTime() - start));

    }

    private void go4(int lim) {

        Integer[] list = new Integer[lim];

        for (int i = 0; i < lim; i++) {
            list[i] = i;
        }

        long start = System.nanoTime();
        long sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println(sum + " arr time " + (System.nanoTime() - start));
    }

    private void go3(int lim) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < lim; i++) {
            list.add(i);
        }

        long start = System.nanoTime();
        long sum = 0;

        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println(sum + " arl time " + (System.nanoTime() - start));
    }


    private void go1(int lim) {

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < lim; i++) {
            list.add(i);
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
            list.add(i);
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

    class MyArr<T> implements Iterable<T> {

        private Object[] items = new Object[16];

        int pointer = 0;

        @Override
        public Iterator<T> iterator() {

            return new Iterator<T>() {

                int pointer = 0;

                @Override
                public boolean hasNext() {
                    return items[pointer] != null;
                }

                @Override
                public T next() {
                    return (T) items[pointer++];
                }
            };

        }

        public void add(T item) {
            if (pointer == items.length) {
                items = Arrays.copyOf(items, items.length * 2, Object[].class);
            }
            items[pointer] = item;
            pointer++;
        }

    }


}
