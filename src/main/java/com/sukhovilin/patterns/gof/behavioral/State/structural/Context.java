package com.sukhovilin.patterns.gof.behavioral.State.structural;

/**
 * The 'Context' class
 */
class Context {
	private State state;

	// Constructor
	public Context(State state) {
		this.setState(state);
	}

	// Gets or sets the state
	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
		System.out.println("State: " + state.getClass().getName());
	}

	public void request() {
		state.handle(this);
	}
}