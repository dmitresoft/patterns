package com.sukhovilin.tasks.my_stack_by_list;

import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        new App().go();
    }

    private void go() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    private class MyStack<T> {

        List<T> list = new LinkedList<>();

        public void push(T x) {
            list.add(0, x);
        }

        public T pop() {
            T result = null;
            var it = list.iterator();
            if (it.hasNext()) {
                result = it.next();
                it.remove();
            }
            return result;
        }
    }
}
