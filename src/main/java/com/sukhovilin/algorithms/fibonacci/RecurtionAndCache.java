package com.sukhovilin.algorithms.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class RecurtionAndCache {

    public static void main(String[] args) {

        for (int i = 0; i <= 46; i += 2) {
            long start = System.nanoTime();
            long fib = fib(i, new HashMap<>());
            System.out.println("fib(" + i + ") = " + fib + "\t" + (System.nanoTime() - start));
        }

    }

    private static long fib(int n, Map<Integer, Long> cache) {
        if (n <= 1) return n;
        if (cache.containsKey(n)) return cache.get(n);
        long result = fib(n - 1, cache) + fib(n - 2, cache);
        cache.put(n, result);
        return result;
    }

}
