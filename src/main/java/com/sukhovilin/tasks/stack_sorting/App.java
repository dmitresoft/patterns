package com.sukhovilin.tasks.stack_sorting;

import java.util.List;
import java.util.Stack;

public class App {

    public static void main(String[] args) {
        new App().go();
    }

    private void go() { // STACK SORT
        Stack<Integer> stack = new Stack<>();
        stack.addAll(List.of(2, 3, 4, 1, 5));
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()) {
            int tmp = stack.pop();
            while (!help.isEmpty() && help.peek() > tmp) {
                stack.push(help.pop());
            }
            help.push(tmp);
        }
        System.out.println(help);
    }
}
