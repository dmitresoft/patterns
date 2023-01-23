package com.sukhovilin.lang.closure;

import java.util.function.Function;
import java.util.function.Supplier;

public class NewSample {

    public static void main(String[] args) {

        Supplier<Function<Integer, Integer>> gen = () -> {
            final int[] n = {1};
            return (Function<Integer, Integer>) input -> {
                n[0]++;
                return input + n[0];
            };
        };

        Function<Integer, Integer> c1 = gen.get();
        Function<Integer, Integer> c2 = gen.get();

        System.out.println(c1.apply(2));
        System.out.println(c2.apply(2));

    }

}
