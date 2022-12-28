package com.sukhovilin.patterns.gof.structural.Decorator.realworld;

/**
 * The 'Decorator' abstract class
 */
abstract class Decorator extends LibraryItem {
	protected LibraryItem libraryItem;

	// Constructor
	public Decorator(LibraryItem libraryItem) {
		this.libraryItem = libraryItem;
	}

	@Override
	public void display() {
		libraryItem.display();
	}
}