package com.sukhovilin.lang.closure;

public class SampleAll {

	public static void main(String[] args) {

		String[] a = new String[] { "1", "2", "3", "4" };
		System.out.println(testAll(a));

		String[] b = new String[] { "1", "-2", "3" };
		System.out.println(testAll(b));

	}

	private static boolean testAll(String[] items) {
		return all(new Predicate<String>() {
			@Override
			public boolean apply(String input) {
				return input.length() == 1;
			}
		}, items);
	}

	private static final <T> boolean all(Predicate<T> predicate, T... items) {
		for (T item : items) {
			if (!predicate.apply(item))
				return false;
		}
		return true;
	}

}
