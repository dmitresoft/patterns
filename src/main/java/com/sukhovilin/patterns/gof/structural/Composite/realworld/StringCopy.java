package com.sukhovilin.patterns.gof.structural.Composite.realworld;

import java.util.Arrays;

class StringCopy {
	private String value;

	public StringCopy(char ch, int count) {
		char[] cs = new char[count];
		Arrays.fill(cs, ch);
		value = new String(cs);
	}

	@Override
	public String toString() {
		return value;
	}
}