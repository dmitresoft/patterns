package com.sukhovilin.patterns.gof.creational.Singleton.structural;

/**
 * The 'Singleton' class
 */
class Singleton {
	private static Singleton instance;

	// Constructor is 'protected'
	protected Singleton() {
	}

	public static Singleton Instance() {
		// Uses lazy initialization.
		// Note: this is not thread safe.
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}