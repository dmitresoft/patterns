package com.sukhovilin.patterns.gof.behavioral.Memento.structural;

/**
 * The 'Originator' class
 */
class Originator {
	private String state;

	// Property
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("State = " + this.state);
	}

	// Creates memento
	public Memento createMemento() {
		return (new Memento(state));
	}

	// Restores original state
	public void setMemento(Memento memento) {
		System.out.println("Restoring state...");
		setState(memento.getState());
	}
}