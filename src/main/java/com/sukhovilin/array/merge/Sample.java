package com.sukhovilin.array.merge;

import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {

		final int[] a = new int[] { 12, 42, 58, 127 };
		final int[] b = new int[] { 22, 32, 64, 82 };

		final int[] r = merge(a, b);
		System.out.println(Arrays.toString(r));
	}

	private static int[] merge(final int[] a, final int[] b) {
		final int al = a.length;
		final int bl = b.length;
		final int[] result = new int[al + bl];

		int ai = 0;
		int bi = 0;
		int idx = 0;

		while (ai < al && bi < bl) {
			if (a[ai] > b[bi])
				result[idx++] = b[bi++];
			else
				result[idx++] = a[ai++];
		}

		while (ai < al) {
			result[idx++] = a[ai++];
		}

		while (bi < bl) {
			result[idx++] = b[bi++];
		}

		return result;
	}

}
