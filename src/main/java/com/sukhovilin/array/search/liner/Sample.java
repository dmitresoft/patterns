package com.sukhovilin.array.search.liner;

public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] m = new int[10];
		for (int i = 0; i < m.length; i++) {
			m[i] = i + 1;
		}

		int r0 = search(m, 5);
		int r1 = search(m, 25);

		System.out.println(r0);
		System.out.println(r1);

	}

	private static int search(int[] m, int target) {
		for (int i = 0; i < m.length; i++)
			if (m[i] == target)
				return m[i];
		// not found
		return -1;
	}

}