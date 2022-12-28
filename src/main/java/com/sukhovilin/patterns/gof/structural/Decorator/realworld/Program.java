package com.sukhovilin.patterns.gof.structural.Decorator.realworld;

/**
 * MainApp startup class for Real-World Decorator Design Pattern.
 * 
 * @author Dmitry Sukhovilin
 */
class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {

		// Create book
		Book book = new Book("Worley", "Inside ASP.NET", 10);
		book.display();

		// Create video
		Video video = new Video("Spielberg", "Jaws", 23, 92);
		video.display();

		// Make video borrowable, then borrow and display
		System.out.println("\nMaking video borrowable:");
		Borrowable borrowvideo = new Borrowable(video);
		borrowvideo.BorrowItem("Customer #1");
		borrowvideo.BorrowItem("Customer #2");
		borrowvideo.display();
	}
}