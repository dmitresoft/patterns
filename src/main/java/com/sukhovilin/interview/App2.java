package com.sukhovilin.interview;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class App2 {

    private static int number = 2;



    public static void main(String[] args) {

        for (int i=0;i<100;i++){

            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(;;){
                        System.out.println(number);
                        Thread.yield();
                    }
                }
            }).start();

        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        number = 42;


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }

}
