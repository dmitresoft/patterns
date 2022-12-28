package com.sukhovilin.algorithms.various;

public class CommaSeparetedList {
	public static void main(String[] args) {

		final String[] list = new String[] { "Red", "Green", "Blue" };

		StringBuilder result = new StringBuilder();
		String comma = "";
		
		for (String item : list) {
			result.append(comma);
			comma = ",";
			result.append(item);
		}

		System.out.println(result);
	}
}
