package com.sukhovilin.array.search.binary;


/**
 * Binary search with recursion
 * 
 * @author Dmitry Sukhiovilin
 * 
 */
public class Recursion {

	private static final int MAX = 20;

	public static void main(String[] args) {

		int[] a = new int[MAX];

		// init
		for (int i = 0; i < MAX; i++) {
			a[i] = i + 1;
		}

		System.out.println(search(a, 3));
		System.out.println(search(a, 6));
		System.out.println(search(a, -1));
	}

	private static final int search(int[] a, int t) {
		return search(a, t, 0, a.length - 1);
	}

	private static final int search(int[] a, int target, int low, int high) {

		if (high < low)
			return -1;

		int middle = (low + high) >>> 1;

		if (a[middle] == target)
			return target;

		if (target > a[middle])
			return search(a, target, middle + 1, high);

		return search(a, target, low, middle - 1);

	}

}
