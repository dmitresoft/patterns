package com.sukhovilin.patterns.gof.behavioral.Memento.structural;

/**
 * MainApp startup class for Structural Memento Design Pattern.
 */
public class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		Originator o = new Originator();
		o.setState("On");

		// Store internal state
		Caretaker c = new Caretaker();
		c.setMemento(o.createMemento());
		
		// Continue changing originator
		o.setState("Off");
		
		// Restore saved state
		o.setMemento(c.getMemento());
	}
}