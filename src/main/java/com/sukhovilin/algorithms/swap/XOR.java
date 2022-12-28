package com.sukhovilin.algorithms.swap;

/**
 * This works too slowly
 * 
 * @author Dmitry Sukhovilin
 */
public class XOR {

	public static void main(String[] args) {

		// init
		int x = 23;
		int y = 32;

		System.out.println("before: x=" + x + " y=" + y);

		// swap
		x ^= y;
		y ^= x;
		x ^= y;

		System.out.println("after: x=" + x + " y=" + y);

	}
}
