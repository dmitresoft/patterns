package com.sukhovilin.patterns.gof.behavioral.Memento.realworld;

/**
 * MainApp startup class for Real-World Memento Design Pattern.
 */
public class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		SalesProspect s = new SalesProspect();
		s.setName("Noel van Halen");
		s.setPhone("(412) 256-0990");
		s.setBudget(25000.0d);

		// Store internal state
		ProspectMemory m = new ProspectMemory();
		m.setMemento(s.saveMemento());

		// Continue changing originator
		s.setName("Leo Welch");
		s.setPhone("(310) 209-7111");
		s.setBudget(1000000.0d);

		// Restore saved state
		s.restoreMemento(m.getMemento());
	}
}