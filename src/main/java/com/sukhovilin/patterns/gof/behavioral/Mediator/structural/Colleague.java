package com.sukhovilin.patterns.gof.behavioral.Mediator.structural;

/**
 * The 'Colleague' abstract class
 */
abstract class Colleague {
	protected Mediator mediator;

	// Constructor
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
}