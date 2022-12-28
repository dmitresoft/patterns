package com.sukhovilin.patterns.gof.behavioral.Mediator.realworld;

/**
 * A 'ConcreteColleague' class
 */
class Beatle extends Participant {
	// Constructor
	public Beatle(String name) {
		super(name);
	}

	@Override
	public void receive(String from, String message) {
		System.out.println("To a Beatle: " + message);
		super.receive(from, message);
	}
}