package com.sukhovilin.patterns.gof.structural.Facade.realworld;

/**
 * Customer class
 */
class Customer {
	private String _name;

	// Constructor
	public Customer(String name) {
		this._name = name;
	}

	// Gets the name
	public String getName() {
		return _name;
	}
}