package com.sukhovilin.algorithms.recursion;

public class CallMethod {

    public static void main(String[] args) {
        new CallMethod().go();
    }

    protected void go() {
        int r = call(5);
        System.out.println(r);
    }

    private int call(final int n) {
        if (n == 0) throw new RuntimeException("oops");
        try {
            if (n == 2) return 101;
            throw new RuntimeException("network failure");
        } catch (Exception e) {
            return call(n - 1);
        }

    }


}
