package com.sukhovilin.lang.oop.encapsulation;

public class Calculator {

	public int add(int x, int y) {
		return x + y;
	}

	public int factorial(int x) {

		if (x == 1)
			return 1;

		return x * factorial(x - 1);
	}

}
