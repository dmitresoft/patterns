package com.sukhovilin.interview;

import java.util.ArrayList;

public class App3 {
    public static void main(String...args) {
        ArrayList<String> s =  new ArrayList<>();
        s.add( "one");
        s.set(0, "one!");
        System.out.println(s);
    }
}
