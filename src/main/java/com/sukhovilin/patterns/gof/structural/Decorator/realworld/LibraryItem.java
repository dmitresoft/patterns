package com.sukhovilin.patterns.gof.structural.Decorator.realworld;

/**
 * The 'Component' abstract class
 */
abstract class LibraryItem {
	private int numCopies;

	// Property
	public int getNumCopies() {
		return numCopies;
	}

	public void setNumCopies(int value) {
		numCopies = value;
	}

	public abstract void display();
}