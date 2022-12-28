package com.sukhovilin.patterns.gof.behavioral.Memento.structural;

/**
 * The 'Memento' class
 */
class Memento {
	private String state;

	// Constructor
	public Memento(String state) {
		this.state = state;
	}

	// Gets or sets state
	public String getState() {
		return this.state;
	}
}