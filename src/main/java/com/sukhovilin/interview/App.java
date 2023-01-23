package com.sukhovilin.interview;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>();
        Random r = new Random();
        for (int i=0;i<100;i++){
            int v = r.nextInt(100);
           map.put( v,2);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
        }

    }
}
