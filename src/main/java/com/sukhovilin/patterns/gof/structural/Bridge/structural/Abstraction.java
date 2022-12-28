package com.sukhovilin.patterns.gof.structural.Bridge.structural;

/**
 * The 'Abstraction' class
 */
class Abstraction {
	protected Implementor implementor;

	// Property
	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}

	public void Operation() {
		implementor.Operation();
	}
}