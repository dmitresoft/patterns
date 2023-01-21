package com.sukhovilin.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class App1 {

    public static void main(String[] args) {
        new App1().go1();
    }

    String me = "";

    private void go1() {


        Thread.yield();

    }

}

class Key {

    private final String value;

    public Key(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Key key
                && key.value.equals(this.value);
    }

}
