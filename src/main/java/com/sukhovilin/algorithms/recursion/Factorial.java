package com.sukhovilin.algorithms.recursion;

/**
 * Calculates factorial
 * 
 * @author Dmitry Sukhovilin
 */
public class Factorial {

	public static void main(String[] args) {
		long n = 20;
		while (n >= 0) {
			System.out.printf("%d - %0,2d\n", n, factorial(n--));
		}
	}

	public static long factorial(long n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

}
