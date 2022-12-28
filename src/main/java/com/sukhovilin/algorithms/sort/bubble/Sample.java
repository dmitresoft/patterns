package com.sukhovilin.algorithms.sort.bubble;

import java.util.Arrays;
import java.util.Random;

public class Sample {

	private static final Random RND = new Random();

	public static void main(String[] args) {

		int[] m = new int[10];

		// init
		for (int i = 0; i < m.length; i++)
			m[i] = RND.nextInt(50);

		// before
		System.out.println(Arrays.toString(m));

		sort(m);

		// after
		System.out.println(Arrays.toString(m));
		
	}

	// bubble sorting
	private static void sort(int[] m) {
		
		for (int i = m.length - 1; i > 0; i--)
			for (int j = 0; j < i; j++)
				if (m[j] > m[j + 1]) {
					int t = m[j];
					m[j] = m[j + 1];
					m[j + 1] = t;
				}
	}
}
