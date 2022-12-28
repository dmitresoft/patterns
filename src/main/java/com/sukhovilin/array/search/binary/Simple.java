package com.sukhovilin.array.search.binary;

/**
 * Binary search sample
 * 
 * @author Dmitry Sukhovilin
 * 
 */
public class Simple {

	public static void main(String[] args) {

		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}

		int r0 = binarySearch(a, 4);
		int r1 = binarySearch(a, 13);
		int r2 = binarySearch(a, -2);

		System.out.println(r0 + " " + r1 + " " + r2);
	}

	private static int binarySearch(int[] a, int key) {

		int low = 0;
		int high = a.length - 1;

		while (low <= high) {

			int middle = (low + high) >>> 1;

			if (key == a[middle])
				return key;

			if (key > a[middle])
				low = middle + 1;
			else
				high = middle - 1;

		}
		return -1; // not found
	}
}
