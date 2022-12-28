package com.sukhovilin.algorithms.recursion;

/**
 * Calculates triangle numbers
 * 
 * @author Dmitry Sukhovilin
 */
public class Triangles {

	private static final int MAX = 1000 * 100 * 1008;

	public static void main(String[] args) {
		final int max = 5;

		System.out.println(methodCycle(max));
		System.out.println(methodRecurecy(max));

		testCycle(max);
		testRecurcy(max);
	}

	// calculate triangles

	private static int methodCycle(final int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		return result;
	}

	private static int methodRecurecy(final int n) {
		return n != 1 ? n + methodRecurecy(n - 1) : 1;
	}

	// performance tests

	private static void testCycle(final int n) {
		final long s = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			methodCycle(n);
		}
		final long f = System.currentTimeMillis();
		System.out.println("c: " + (f - s));
	}

	private static void testRecurcy(final int n) {
		final long s = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			methodRecurecy(n);
		}
		final long f = System.currentTimeMillis();
		System.out.println("r: " + (f - s));
	}
}
