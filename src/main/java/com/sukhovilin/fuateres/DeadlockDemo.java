package com.sukhovilin.fuateres;

public class DeadlockDemo {

    public static void main(String[] args) {

        Object r1 = new Object();
        Object r2 = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (r1) {
                    System.out.println("t1 r1");
                    sleep(1000);
                    System.out.println("t1 after wait");
                    synchronized (r2) {
                        System.out.println("wow 1");
                    }
                }
            }
        }).start();

        // -------------------------

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (r2) {
                    System.out.println("t2 r2");
                    synchronized (r1) {
                        System.out.println("wow 2");
                    }
                }
            }
        }).start();


    }


    private static void sleep(long i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
