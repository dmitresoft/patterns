package com.sukhovilin.interview;

import java.util.HashMap;
import java.util.Map;

public class App2 implements Runnable{

    public void run() {
        System.out.printf("Java ");
        System.out.printf("World ");
    }

    public static void main(String[] args) {
        App2 obj = new App2();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.printf("SDE ");
        try {
            thread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("for ");
    }
}
