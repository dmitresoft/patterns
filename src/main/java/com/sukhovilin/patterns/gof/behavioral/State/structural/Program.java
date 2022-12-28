package com.sukhovilin.patterns.gof.behavioral.State.structural;

/**
 * MainApp startup class for Structural State Design Pattern.
 */
class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		// Setup context in a state
		Context c = new Context(new ConcreteStateA());

		// Issue requests, which toggles state
		c.request();
		c.request();
		c.request();
		c.request();
	}

}