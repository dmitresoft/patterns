package com.sukhovilin.algorithms.sort.count;

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

	private static void sort(int[] m) {
		
		final int[] counts = new int[MAX];

		for (int i = 0; i < m.length; i++)
			for (int c = 0; c < MAX; c++)
				if (m[i] == c)
					counts[c]++;

		// System.out.println(Arrays.toString(counts));

		int c = 0;
		for (int j = 0; j < MAX; j++) {
			for (int k = 0; k < counts[j]; k++) {
				m[c++] = j;
			}
		}
		
	}
}
