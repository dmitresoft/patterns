package com.sukhovilin.algorithms.various;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BracketsCounter {

	public static void main(String[] args) {

		final String text0 = "(3+2)-((2*3)-8)";
		final String text1 = "(3+2)-(2*3)-8)";

		boolean result0 = process(text0);
		System.out.println(result0);

		boolean result1 = process(text1);
		System.out.println(result1);
	}

	private static boolean process(String text) {
		Queue<Character> queue = new LinkedBlockingQueue<Character>();

		for (int i = 0; i < text.length(); i++) {
			Character ch = text.charAt(i);

			if (ch == '(') {
				queue.add(ch);
				
			} else if (ch == ')') {
				Character pool = queue.poll();
				if (pool == null || pool != '(')
					return false;
			}

		}

		return queue.isEmpty();
	}

}