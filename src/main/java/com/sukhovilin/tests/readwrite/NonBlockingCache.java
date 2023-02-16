package com.sukhovilin.tests.readwrite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;

public class NonBlockingCache<K, V> implements Cache<K, V> {

    private final Map<K, V> cache = new HashMap<>();
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();
    private final ReentrantReadWriteLock.ReadLock readLock = lock.readLock();

    @Override
    public void add(Collection<V> items, Function<V, K> key) {
        writeLock.lock();
        try {
            cache.clear();
            for (V item : items) {
                cache.put(key.apply(item), item);
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public V find(K key) {

        readLock.lock();
        try {
            final int size = cache.size();
            if (size != 10_000) {
                System.out.println("cracked " + size);
            }
            return cache.get(key);
        } finally {
            readLock.unlock();
        }
    }

}
