package com.sukhovilin.tasks.brackets;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Searching open and close brackets inside a given string.
 */
public class App {

    public static void main(String[] args) {
        String str = "as[edwe[45]324]rfer[erf[[e]]ef]ff";
        //            012345678901234567890123456789012
        //                      1         2         3
        new App().go(str);
    }

    private void go(String str) {

        Map<Integer, Integer> map = new HashMap<>();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '[') {
                stack.push(i);
            } else if (c == ']') {
                map.put(stack.pop(), i);
            }
        }

        System.out.println(map);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(str.substring(entry.getKey() + 1, entry.getValue()));
        }

    }

}
