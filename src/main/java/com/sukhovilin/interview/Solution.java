package com.sukhovilin.interview;

import java.util.*;

public class Solution {


    class NetworkClient{
        SessionHandler handler;
        void setHandler(SessionHandler handler){
            this.handler = handler;
        }
        private void receive(byte[] bytes){
            // ...
            handler.receive(bytes);
        }
        private void send(byte[] bytes){
            // ...
            handler.send(bytes);
        }
    }
    interface SessionHandler {
        void receive(byte[] bytes);
        void send(byte[] bytes);
    }

    abstract class MyBaseLogic  implements SessionHandler{
        abstract void secondLogicOnReceive(byte[] bytes);
        abstract void secondLogicOnSend(byte[] bytes);
        @Override
        public void receive(byte[] bytes) {
            // ...
            secondLogicOnReceive(bytes);
        }
        @Override
        public void send(byte[] bytes) {
            // ....
            secondLogicOnSend(bytes);
        }
    }
    class MyLogic extends MyBaseLogic{
        @Override
        void secondLogicOnReceive(byte[] bytes) {
        }
        @Override
        void secondLogicOnSend(byte[] bytes) {
        }
    }




    public static void main(String args[]) {

        var a = new Solution().test(null);
        System.out.println(">> " + a);

        char c = ' ';

    }

    private int test(Object o) {

        A a = new A();

        for (int i = 0; i < 100; i++) {
            a.put(i, i);
            System.out.println("i: " + i + " " + a + " s: " + a.size());
        }


        return 1;

    }

    class A extends LinkedHashMap {
        @Override
        protected boolean removeEldestEntry(Map.Entry eldest) {
            return size() > 10;
        }
    }

}
