package com.sukhovilin.patterns.gof.structural.Decorator.realworld;

/**
 * The 'ConcreteComponent' class
 */
class Book extends LibraryItem {
	private String author;
	private String title;

	// Constructor
	public Book(String author, String title, int numCopies) {
		this.author = author;
		this.title = title;
		this.setNumCopies(numCopies);
	}

	@Override
	public void display() {
		System.out.println("\nBook ------ ");
		System.out.println(String.format(" Author: %s", author));
		System.out.println(String.format(" Title: %s", title));
		System.out.println(String.format(" # Copies: %d", getNumCopies()));
	}

}