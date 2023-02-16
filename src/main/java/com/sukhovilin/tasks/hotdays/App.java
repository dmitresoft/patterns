package com.sukhovilin.tasks.hotdays;

import java.util.Stack;

/**
 * Given an array of integers temperatures represents the daily temperatures,
 * return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
 * If there is no future day for which this is possible, keep answer[i] == 0 instead.
 * <p>
 * <a href="https://leetcode.com/problems/daily-temperatures/">leetcode</a>
 */
public class App {

    public static void main(String[] args) {
        int[] temperatures = {13, 12, 15, 11, 9, 12, 16};
        new App().simple(temperatures);
        System.out.println("-".repeat(10));
        new App().stack(temperatures);
    }

    record Item(int value, int index) {
    }

    private void stack(int[] temperatures) {

        int[] answers = new int[temperatures.length];
        Stack<Item> stack = new Stack<>();

        for (int index = temperatures.length - 1; index >= 0; index--) {

            int temperature = temperatures[index];

            while (!stack.isEmpty() && stack.peek().value < temperature) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                answers[index] = stack.peek().index - index;
            }

            stack.push(new Item(temperature, index));

        }

        show(temperatures, answers);


    }

    private void simple(int[] temperatures) {

        int[] answers = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            int current = temperatures[i];
            answers[i] = 0;

            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[j] > current) {
                    answers[i] = j - i;
                    break;
                }
            }


        }

        show(temperatures, answers);

    }

    private void show(int[] temperatures, int[] answers) {
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println(temperatures[i] + " -> " + answers[i]);
        }
    }


}
