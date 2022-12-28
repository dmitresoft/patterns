package com.sukhovilin.patterns.gof.structural.Decorator.realworld;

import java.util.ArrayList;
import java.util.List;

/**
 * The 'ConcreteDecorator' class
 */
class Borrowable extends Decorator {
	protected List<String> borrowers = new ArrayList<String>();

	// Constructor
	public Borrowable(LibraryItem libraryItem) {
		super(libraryItem);
	}

	public void BorrowItem(String name) {
		borrowers.add(name);
		libraryItem.setNumCopies(libraryItem.getNumCopies() - 1);
	}

	public void ReturnItem(String name) {
		borrowers.remove(name);
		libraryItem.setNumCopies(getNumCopies() + 1);
	}

	@Override
	public void display() {
		super.display();
		for (String borrower : borrowers) {
			System.out.println(" borrower: " + borrower);
		}
	}

}