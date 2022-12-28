package com.sukhovilin.patterns.gof.creational.Prototype.structural;

/**
 * The 'Prototype' abstract class
 */
abstract class Prototype {
	private String id;

	// Constructor
	public Prototype(String id) {
		this.id = id;
	}

	// Gets id
	public String getId() {
		return id;
	}

	public abstract Prototype cloneMe() throws CloneNotSupportedException;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return this;
	}
}