package com.sukhovilin.lang.closure;

public class SmapleClassic {

	public static void main(String[] args) {
		
		final int someVariable = 1;
		
		String result = new Function<Integer, String>() {
			@Override
			public String apply(Integer input) {
				return String.valueOf(someVariable + input);
			}
		}.apply(1);
		
		System.out.println(result);

	}

}
