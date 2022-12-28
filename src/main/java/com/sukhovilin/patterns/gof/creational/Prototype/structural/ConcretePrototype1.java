package com.sukhovilin.patterns.gof.creational.Prototype.structural;

/**
 * A 'ConcretePrototype' class
 */
class ConcretePrototype1 extends Prototype {
	// Constructor
	public ConcretePrototype1(String id) {
		super(id);
	}

	// Returns a shallow copy
	@Override
	public Prototype cloneMe() throws CloneNotSupportedException {
		return (Prototype) clone();
	}
}