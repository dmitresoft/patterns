package com.sukhovilin.patterns.gof.structural.Flyweight.structural;

import java.util.Hashtable;

/**
 * The 'FlyweightFactory' class
 */
class FlyweightFactory {
	private Hashtable<String, Flyweight> flyweights = new Hashtable<String, Flyweight>();

	// Constructor
	public FlyweightFactory() {
		flyweights.put("X", new ConcreteFlyweight());
		flyweights.put("Y", new ConcreteFlyweight());
		flyweights.put("Z", new ConcreteFlyweight());
	}

	public Flyweight GetFlyweight(String key) {
		return (Flyweight) flyweights.get(key);
	}
}