package com.sukhovilin.tests.readwrite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class App {

    public static void main(String[] args) throws InterruptedException {
        new App().test(new BlockingCache<>());
        new App().test(new NonBlockingCache<>());
    }

    private void test(Cache<Integer, String> cache) throws InterruptedException {
        long start = System.nanoTime();
        _test(cache);
        long delta = System.nanoTime() - start;
        System.out.println("time: " + (TimeUnit.NANOSECONDS.toMillis(delta)));
    }

    private void _test(Cache<Integer, String> cache) throws InterruptedException {
        _write(cache); // init
        var wt = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) {
                _write(cache);
            }
            System.out.println("stop writing");
        }, "!writer");
        wt.start();

        Thread[] threads = new Thread[100];
        for (int t = 0; t < threads.length; t++) {
            threads[t] = new Thread(() -> {
                _read(cache);
            }, "!reader"+t);
            threads[t].start();
        }


        for (Thread thread : threads) {
            thread.join();
        }

        wt.join();


    }

    private void _read(Cache<Integer, String> cache) {
        Random rnd = new Random();
        for (int i = 0; i < 100_000; i++) {
            cache.find(rnd.nextInt());
        }
    }

    private void _write(Cache<Integer, String> cache) {
        Collection<String> list = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            list.add("val"+i+"?");
        }
        cache.add(list, String::hashCode);
    }


}
