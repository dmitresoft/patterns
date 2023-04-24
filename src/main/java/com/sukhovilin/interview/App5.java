package com.sukhovilin.interview;

import java.util.*;

public class App5 {
    public static void main(String[] args) {
        new App5().go();
    }

    private void go() {
//        var a1 = myPow(2.00000, 10); // 1024
//        System.out.println(a1);
//        var a2 = myPow(2.10000, 3); // 9.261
//        System.out.println(a2);
//        var a3 = myPow(2.00000, -2); // 0.25
//        System.out.println(a3);
//        var a4 = myPow(1.00000, 2147483647); //
//        System.out.println(a4);

//        var a5 = romanToInt2("MCMXCIV"); // 0.00000
//        System.out.println(a5);

        String[] msgs = new String[]{};
        It it = new It(msgs);

        while (it.hasNext()) {
            //it.hasNext();it.hasNext();
            System.out.println(it.next());
            //System.out.println(it.next());
        }

    }

    private class It implements Iterator<String> {

        private final String[] messages;
        private int current = 0;

        public It(String[] messages) {
            this.messages = messages;
        }

        @Override
        public boolean hasNext() {
            return current < messages.length;
        }

        @Override
        public String next() {
            String answer = messages[current];
            while (++current < messages.length && messages[current] == null) {
            }
                System.out.println("answer-" + answer);
            return answer;

        }
    }

    static Map<String, int[]> patterns = new HashMap<>();

    static {
        patterns.put("CD", new int[]{400, 2});
        patterns.put("CM", new int[]{900, 2});
        patterns.put("C", new int[]{100, 1});
        patterns.put("XL", new int[]{40, 2});
        patterns.put("XC", new int[]{90, 2});
        patterns.put("X", new int[]{10, 1});
        patterns.put("IV", new int[]{4, 2});
        patterns.put("IX", new int[]{9, 2});
        patterns.put("I", new int[]{1, 1});
        patterns.put("V", new int[]{5, 1});
        patterns.put("L", new int[]{50, 1});
        patterns.put("D", new int[]{500, 1});
        patterns.put("M", new int[]{1000, 1});
    }

    public int convert(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public int romanToInt2(String s) {
        int a = 0;
        int last = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            char c = s.charAt(i);
            int r = convert(c);
            if (r > last) {
                a += r;
            } else {
                a -= r;
            }
            last = r;
        }
        return a;
    }

    public int romanToInt1(String s) {

        s = "DCXXI";

//        Map<String, int[]> patterns = new HashMap<>();
//        patterns.put("CD", new int[]{400, 2});
//        patterns.put("CM", new int[]{900, 2});
//        patterns.put("C", new int[]{100, 1});
//        patterns.put("XL", new int[]{40, 2});
//        patterns.put("XC", new int[]{90, 2});
//        patterns.put("X", new int[]{10, 1});
//        patterns.put("IV", new int[]{4, 2});
//        patterns.put("IX", new int[]{9, 2});
//        patterns.put("I", new int[]{1, 1});
//        patterns.put("V", new int[]{5, 1});
//        patterns.put("L", new int[]{50, 1});
//        patterns.put("D", new int[]{500,1});
//        patterns.put("M", new int[]{1000, 1});

        int a = 0;
        for (int i = 0; i < s.length(); ) {
            String tmp = s.substring(i, i < s.length() - 1 ? i + 2 : i + 1);
            int[] r = patterns.get(tmp);
            if (r == null) r = patterns.get(tmp.substring(0, 1));
            i += r[1];
            a += r[0];

        }

        return a;
    }

    private int findNum(Stack<Character> stack) {
        if (stack.isEmpty()) return 0;

        Character c0 = stack.pop();


        return 1;
    }

    public int romanToInt(String s) {
        int a = 0;
        int[] r = new int[1];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; ) {
            i += convert(chars[i], i < chars.length - 1 ? chars[i + 1] : '?', r);
            a += r[0];
        }
        return a;
    }

    private int convert(char c0, char c1, int[] r) {
        if (c0 == 'C') {
            if (c1 == 'D') {
                r[0] = 400;
                return 2;
            }
            if (c1 == 'M') {
                r[0] = 900;
                return 2;
            }
            r[0] = 100;
            return 1;
        }
        if (c0 == 'X') {
            if (c1 == 'L') {
                r[0] = 40;
                return 2;
            }
            if (c1 == 'C') {
                r[0] = 90;
                return 2;
            }
            r[0] = 10;
            return 1;
        }
        if (c0 == 'I') {
            if (c1 == 'V') {
                r[0] = 40;
                return 2;
            }
            if (c1 == 'X') {
                r[0] = 90;
                return 2;
            }
            r[0] = 1;
            return 1;
        }
        r[0] = switch (c0) {
            case 'V' -> 5;
            case 'L' -> 50;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
        return 1;
    }


    public double myPow(double x, int n) {

        if (x == 1) return 1;
        if (n == Integer.MAX_VALUE) return x == -1 ? -1 : 0;
        if (n == Integer.MIN_VALUE) return x == -1 ? 1 : 0;

        double a = 1;
//

        if (n > 0) {
            for (int i = 0; i < n; i++) a *= x;
        } else {
            for (int i = n; i > 0; i++) {
                a /= x;
            }
        }
        return a;
    }

}
