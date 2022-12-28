package com.sukhovilin.patterns.gof.behavioral.Mediator.structural;

/**
 * A 'ConcreteColleague' class
 */
class ConcreteColleague1 extends Colleague {
	// Constructor
	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}

	public void send(String message) {
		mediator.send(message, this);
	}

	public void notify(String message) {
		System.out.println("Colleague1 gets message: " + message);
	}
}