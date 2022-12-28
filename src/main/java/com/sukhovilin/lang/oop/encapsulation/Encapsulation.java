package com.sukhovilin.lang.oop.encapsulation;

public class Encapsulation {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		int add = calculator.add(2, 3);
		System.out.println("2+3=" + add);

		int factorial = calculator.factorial(5);
		System.out.println("factorial(5)=" + factorial);

	}

}
