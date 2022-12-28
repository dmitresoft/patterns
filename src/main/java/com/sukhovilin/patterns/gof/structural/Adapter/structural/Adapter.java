package com.sukhovilin.patterns.gof.structural.Adapter.structural;

/**
 * The 'Adapter' class
 */
class Adapter extends Target {
	private Adaptee adaptee = new Adaptee();

	@Override
	public void request() {
		// Possibly do some other work and then call SpecificRequest
		adaptee.SpecificRequest();
	}
}