package com.sukhovilin.algorithms.sort.insert;

import java.util.Arrays;
import java.util.Random;

public class Sample {

	private static final Random RND = new Random();
	private static final int MAX = 20;

	public static void main(String[] args) {

		int[] m = new int[10];

		// init
		for (int i = 0; i < m.length; i++)
			m[i] = RND.nextInt(MAX);

		System.out.println(Arrays.toString(m));

		sort(m);

		System.out.println(Arrays.toString(m));

	}

	/**
	 * Insert sorting implementation
	 * 
	 * @param m
	 *            array to be sorted
	 */
	private static void sort(int[] m) {
		for (int j = 1; j < m.length; j++) {

			final int tmp = m[j];

			int k = j;
			
			for (; k > 0 && tmp < m[k - 1]; k--) 
				m[k] = m[k - 1];
			
			m[k] = tmp;
		}
	}

}
