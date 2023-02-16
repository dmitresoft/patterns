package com.sukhovilin.tests.readwrite;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

public interface Cache<K, V> {

    void add(Collection<V> items, Function<V, K> key);

    V find(K key);

}
