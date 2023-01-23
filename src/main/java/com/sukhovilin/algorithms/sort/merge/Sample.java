package com.sukhovilin.algorithms.sort.merge;

import java.util.Arrays;
import java.util.Random;

/**
 * Sorts with merge algorithm.
 *
 * Сортировки слиянием работают по такому принципу:
 *
 *     Ищутся (как вариант — формируются) упорядоченные подмассивы.
 *     Упорядоченные подмассивы соединяются в общий упорядоченный подмассив.
 * 
 * @author Dmitry Sukhovilin
 */
public class Sample {

	private static final Random RND = new Random();
	private static final int MAX = 20;
	private static final int[] tmp = new int[MAX];
	private static final int[] arr = new int[MAX];

	public static void main(String[] args) {

		// init
		for (int i = 0; i < arr.length; i++)
			arr[i] = RND.nextInt(99) + 1;

		System.out.println(Arrays.toString(arr));
		sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] a, int low, int high) {
		if (high > low) {
			int m = (low + high) >>> 1;
			sort(a, low, m);
			sort(a, m + 1, high);
			merge(a, low, m, high);
		}
	}

	private static void merge(int[] a, int low, int mid, int high) {

		// copy both parts into a temporary array
		for (int i = low; i <= high; i++) {
			tmp[i] = a[i];
		}

		int j = low;
		int k = mid + 1;
		int i = low;

		// fill back the array with sorted values
		while (j <= mid && k <= high) {
			if (tmp[j] > tmp[k])
				a[i++] = tmp[k++];
			else
				a[i++] = tmp[j++];
		}

		// copy left items
		while (j <= mid)
			a[i++] = tmp[j++];

	}

}
