package com.sukhovilin.patterns.gof.structural.Decorator.realworld;

/**
 * The 'ConcreteComponent' class
 */
class Video extends LibraryItem {
	private String director;
	private String title;
	private int playTime;

	// Constructor
	public Video(String director, String title, int numCopies, int playTime) {
		this.director = director;
		this.title = title;
		this.setNumCopies(numCopies);
		this.playTime = playTime;

	}

	@Override
	public void display() {
		System.out.println("\nVideo ----- ");
		System.out.println(String.format(" Director: %s", director));
		System.out.println(String.format(" Title: %s", title));
		System.out.println(String.format(" # Copies: %d", getNumCopies()));
		System.out.println(String.format(" Playtime: %d\n", playTime));
	}
}