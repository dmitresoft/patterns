package com.sukhovilin.patterns.gof.structural.Facade.structural;

/**
 * MainApp startup class for Structural Facade Design Pattern.
 */
public class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.MethodA();
		facade.MethodB();
	}
}