package com.sukhovilin.algorithms.fibonacci;

import java.util.Arrays;

/**
 * The first number of the pattern is 0, the second number is 1, and each number
 * after is equal to the two numbers before it added together.
 * 
 * For example 0+1=1 and 3+5=8.
 */
public class Array {

	public static void main(String[] args) {

		final int MAX = 40;
		final int[] f = new int[MAX];
		
		f[0] = 0;
		f[1] = 1;

		for (int i = 2; i < MAX; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}

		System.out.println(Arrays.toString(f));

	}
}
