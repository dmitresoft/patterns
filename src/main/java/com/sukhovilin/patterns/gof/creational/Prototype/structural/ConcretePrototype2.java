package com.sukhovilin.patterns.gof.creational.Prototype.structural;

/**
 * A 'ConcretePrototype' class
 */
class ConcretePrototype2 extends Prototype {
	// Constructor
	public ConcretePrototype2(String id) {
		super(id);
	}

	// Returns a shallow copy
	@Override
	public Prototype cloneMe() throws CloneNotSupportedException {
		return (Prototype) clone();
	}
}