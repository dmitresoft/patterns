package com.sukhovilin.lang.closure;

import java.util.function.Function;

public class Program1 {

    public static void main(String[] args) {
        new Program1().go();
    }

    private Function<Integer, Integer> create() {
        int offset = 42;
        return new Function<>() {
            @Override
            public Integer apply(Integer x) {
                return x + offset;
            }
        };
    }

    private void go() {
        var f = create();
        System.out.println(f.apply(10));
    }

}
