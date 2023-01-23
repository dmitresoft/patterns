package com.sukhovilin.algorithms.partition;

import java.util.Arrays;
import java.util.Random;

public class Simple {

	private static final Random RND = new Random();
	private static final int MAX = 20;

	public static void main(String[] args) {

		int[] a = new int[MAX];
		for (int i = 0; i < MAX; i++)
			a[i] = RND.nextInt(20);

		System.out.println(Arrays.toString(a));
		int point = partition(a, 0, a.length - 1, 10);
		System.out.println(Arrays.toString(a));
		System.out.println("Point is: " + point);

	}

	private static int partition(int[] a, int low, int high, int pivot) {

		int lowp = low - 1;
		int highp = high + 1;
		do {
			// looking for lower item
			while (lowp < high && a[++lowp] < pivot)
				;

			// looking for higher item
			while (highp > low && a[--highp] > pivot)
				;

			swap(a, lowp, highp);

		} while (lowp < highp);
	
		return lowp;
	}

	private static void swap(final int[] arr, final int from, final int to) {
		final int tmp = arr[from];
		arr[from] = arr[to];
		arr[to] = tmp;
	}

}
