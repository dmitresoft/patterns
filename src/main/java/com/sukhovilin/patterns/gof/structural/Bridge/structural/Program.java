package com.sukhovilin.patterns.gof.structural.Bridge.structural;

/**
 * MainApp startup class for Structural Bridge Design Pattern.
 */
public class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		Abstraction ab = new RefinedAbstraction();

		// Set implementation and call
		ab.setImplementor(new ConcreteImplementorA());
		ab.Operation();

		// Change implemention and call
		ab.setImplementor(new ConcreteImplementorB());
		ab.Operation();
	}
}