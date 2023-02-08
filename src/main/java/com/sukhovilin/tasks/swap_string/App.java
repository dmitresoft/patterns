package com.sukhovilin.tasks.swap_string;

public class App {

    public static void main(String[] args) {
        new App().go();
    }

    private void go() { // SWAP STRING
        byte[] bs = "Hello world".getBytes();
        for (int i = 0; i < bs.length / 2; i++) {
            swap(bs, i, bs.length - i - 1);
        }
        System.out.println(new String(bs));
    }
    private void swap(byte[] arr, int from, int to) {
        var t = arr[from];
        arr[from] = arr[to];
        arr[to] = t;
    }

}
