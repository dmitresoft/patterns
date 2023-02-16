package com.sukhovilin.tests.readwrite;

import javax.swing.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class BlockingCache<K, V> implements Cache<K, V> {

    private final Map<K, V> cache = new ConcurrentHashMap<>();
            //HashMap<>();
    private final Object monitor = new Object();

    @Override
    public void add(Collection<V> items, Function<V, K> key) {
        synchronized (monitor) {
            cache.clear();
            for (V item : items) {
                cache.put(key.apply(item), item);
            }
        }
    }

    @Override
    public V find(K key) {
        synchronized (monitor) {
            final int size = cache.size();
            if (size != 10_000) {
                System.out.println("cracked " + size);
            }
            return cache.get(key);

        }
    }

}
