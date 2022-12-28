package com.sukhovilin.patterns.gof.behavioral.Mediator.realworld;

/**
 * A 'ConcreteColleague' class
 */
class NonBeatle extends Participant {
	// Constructor
	public NonBeatle(String name) {
		super(name);
	}

	@Override
	public void receive(String from, String message) {
		System.out.println("To a non-Beatle: "+ message);
		super.receive(from, message);
	}
}