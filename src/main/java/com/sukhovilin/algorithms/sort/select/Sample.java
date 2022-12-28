package com.sukhovilin.algorithms.sort.select;

import java.util.Arrays;
import java.util.Random;

public class Sample {

	private static final Random RND = new Random();

	public static void main(String[] args) {

		int[] m = new int[20];

		// init
		for (int i = 0; i < m.length; i++)
			m[i] = RND.nextInt(100);

		System.out.println(Arrays.toString(m));

		// select sorting
		for (int j = 0; j < m.length - 1; j++) {

			int min = j;

			for (int k = j + 1; k < m.length; k++)
				if (m[min] > m[k])
					min = k;
			// swap
			int t = m[j];
			m[j] = m[min];
			m[min] = t;
		}

		System.out.println(Arrays.toString(m));

	}

}
