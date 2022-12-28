package com.sukhovilin.patterns.gof.behavioral.Observer.structural;


/**
 * MainApp startup class for Structural Observer Design Pattern.
 */
public class Program {

	public static void main(String[] args) {

		// Configure Observer pattern
		ConcreteSubject s = new ConcreteSubject();
		s.attach(new ConcreteObserver(s, "X"));
		s.attach(new ConcreteObserver(s, "Y"));
		s.attach(new ConcreteObserver(s, "Z"));

		// Change subject and notify observers
		s.setSubjectState("ABC");
		s.change();

	}
}
