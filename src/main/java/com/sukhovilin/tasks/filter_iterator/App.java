package com.sukhovilin.tasks.filter_iterator;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Real question from Yandex.
 */
public class App {

    public static void main(String[] args) {

        var r1 =new Filter<>(List.of(1, 1, 1, 2, 3, 4, 6, 7).iterator(), x -> x % 2 == 0);
        show(r1);

    }

    private static void show(Filter<Integer> it) {
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }


    static class Filter<T> implements Iterator<T> {

        private final Iterator<T> iterator;
        private final Predicate<T> filter;

        public Filter(Iterator<T> iterator, Predicate<T> filter) {
            this.iterator = iterator;
            this.filter = filter;
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }

    }

}
