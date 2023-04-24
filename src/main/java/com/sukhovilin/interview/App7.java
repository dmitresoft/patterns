package com.sukhovilin.interview;

import java.util.*;

public class App7 {

    static public void main(String[] args) {
        var r = new App7().repeatedSubstringPattern(null);
        System.out.println(">>>" + r);
    }

    public boolean repeatedSubstringPattern(String s) {
        s = "abab"; // true
        s = "aba"; //false
        s = "abcabcabcabc";// true
        s = "aabaaba"; // false
        s = "abcabc";


        int l = 1;
        char[] chars =s.toCharArray();
        int full = chars.length;
        int len = full / 2 + 1;
        while (l < len) {

            char[] sub = s.substring(0, l).toCharArray();
            int sub_len = sub.length;

            if (full % sub_len != 0) {
                l++;
                continue;
            }

            boolean f = true;
            for (int i = 0; i < full; i++) {
                char c = sub[i % sub_len];
                if (chars[i] != c) {
                    f = false;
                    break;
                }
            }
            if (f) return true;
            l++;
        }

        return false;
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        word1 = new String[]{"ab", "c"};
        word2 = new String[]{"a", "bc"};

        word1 = new String[]{"a", "cb"};
        word2 = new String[]{"ab", "c"};

        return makeString(word1).equals(makeString(word2));
    }

    private String makeString(String[] word1) {
        StringBuilder sb = new StringBuilder();
        for (String s : word1) sb.append(s);
        return sb.toString();
    }

    public char slowestKey(int[] releaseTimes, String keysPressed) {
        releaseTimes = new int[]{9, 29, 49, 50};
        keysPressed = "cbcd";

        releaseTimes = new int[]{12, 23, 36, 46, 62};
        keysPressed = "spuda"; // a

        //releaseTimes = new int[]{1,2};
        //keysPressed = "ba"; // b

        char ans = 'a';
        int max = 0;
        int last = 0;

        for (int i = 0; i < releaseTimes.length; i++) {

            int t = releaseTimes[i] - last;
            last = releaseTimes[i];


            if (t == max) {
                char c = keysPressed.charAt(i);
                if (c > ans) ans = c;
            }

            if (t > max) {
                max = t;
                ans = keysPressed.charAt(i);
                ;
            }

        }

        return ans;
    }

    public int maximumPopulation(int[][] logs) {

        logs = new int[][]{{1950, 1961}, {1960, 1971}, {1970, 1981}}; // 1960

        int pop[] = new int[2051], res = 0;
        for (var l : logs) {
            ++pop[l[0]];
            --pop[l[1]];
        }
        for (int i = 1950; i < 2050; ++i) {
            pop[i] += pop[i - 1];
            res = pop[i] > pop[res] ? i : res;
        }
        return res;
    }

    public int maximumPopulation1(int[][] logs) {
        logs = new int[][]{{1993, 1999}, {2000, 2010}};
        logs = new int[][]{{1950, 1961}, {1960, 1971}, {1970, 1981}}; // 1960

        int maxp = peopleForYear(logs, logs[0][0]);
        for (int i = 0; i < logs.length; i++) {
            int year = logs[i][0];
            int n = peopleForYear(logs, year);
            if (n > maxp) maxp = n;
        }
        int miny = 3000;
        for (int[] bd : logs) {
            int year = bd[0];
            int n = peopleForYear(logs, year);
            if (n == maxp) {
                if (year < miny) miny = year;
            }
        }

        //System.out.println(maxp + " " + miny);

        return miny;

    }

    int peopleForYear(int[][] log, int year) {
        int n = 0;
        for (int[] x : log) {
            if (year >= x[0] && year < x[1]) {
                n++;
            }
        }
        return n;
    }


    public String largestOddNumber(String num) {
        num = "35427";
        //num = "52";


        for (int i = num.length() - 1; i >= 0; --i) {
            char c = num.charAt(i);
            if (c == '1' || c == '3' || c == '5' || c == '7' || c == '9') {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }

    public int minDistance(String word1, String word2) { // https://leetcode.com/problems/edit-distance/
        word1 = "grass";
        word2 = "fast";

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        int[][] r = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i < r.length; i++) {
            r[i][0] = i;
        }
        for (int i = 0; i < r[0].length; i++) {
            r[0][i] = i;
        }

        for (int i = 1; i <= w1.length; i++) {
            for (int j = 1; j <= w2.length; j++) {
                boolean s = w1[i - 1] == w2[j - 1];
                int x = min(r, i, j, s);
                r[i][j] = s ? x : ++x;
            }
        }

        show(r);

        return r[w1.length][w2.length];
    }

    private int min(int[][] r, int x, int y, boolean s) {
        if (s) return r[x - 1][y - 1];

        int a = r[x - 1][y];
        int b = r[x][y - 1];
        int c = r[x - 1][y - 1];

        if (a <= b && a <= c) {
            return a;
        } else if (b <= c && b <= a) {
            return b;
        }
        return c;
    }

    void show(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public String decodeMessage(String key, String message) {

        key = "the quick brown fox jumps over the lazy dog";
        message = "vkbs bs t suepuv";

        Map<Character, Character> matrix = new HashMap<>();
        int index = 'a';
        for (int i = 0; i < key.length() && index <= 'z'; i++) {
            char c = key.charAt(i);
            if (c != ' ' && !matrix.containsKey(c)) {
                matrix.put(c, (char) index);
                index++;
            }
        }
        char[] ans = new char[message.length()];
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            ans[i] = matrix.getOrDefault(c, ' ');
        }
        return new String(ans);
    }

}
