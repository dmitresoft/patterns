package com.sukhovilin.algorithms.sort.quick;

import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 5, 4, 6, 7, 9, 2 };
		qSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

	public static void qSort(final int[] array, final int low, final int high) {
		int l = low;
		int r = high;
		final int mid = array[(low + high) / 2];
		do {
			while (array[l] < mid)
				l++;
			while (array[r] > mid)
				r--;
			if (l <= r) {
				final int temp = array[l];
				array[l] = array[r];
				array[r] = temp;
				l++;
				r--;
			}
		} while (l <= r);

		if (low < r)
			qSort(array, low, r);

		if (l < high)
			qSort(array, l, high);
	}
}
