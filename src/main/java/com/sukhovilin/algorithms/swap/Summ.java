package com.sukhovilin.algorithms.swap;

public class Summ {

	public static void main(String[] args) {

		// init
		int x = 23;
		int y = 32;

		System.out.println("before: x=" + x + " y=" + y);

		x = x - y;
		y = x + y;
		x = y - x;

		System.out.println(" after: x=" + x + " y=" + y);

	}

}
