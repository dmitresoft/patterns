package com.sukhovilin.patterns.gof.creational.FactoryMethod.realworld;

/**
 * MainApp startup class for Real-World Factory Method Design Pattern.
 */
class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {

		// Note: constructors call Factory Method
		AbstractDocument[] documents = new AbstractDocument[2];
		documents[0] = new ResumeDocument();
		documents[1] = new ReportDocument();

		// Display document pages
		for (AbstractDocument document : documents) {
			System.out.println("\n" + document.getClass().getSimpleName() + "--");
			for (AbstractPage page : document.getPages()) {
				System.out.println(" " + page.getClass().getSimpleName());
			}
		}
	}
}