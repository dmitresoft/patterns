package com.sukhovilin.patterns.gof.behavioral.TemplateMethod.realworld;


/**
 * MainApp startup class for Real-World Template Design Pattern.
 */
class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		DataAccessObject daoCategories = new Categories();
		daoCategories.run();

		DataAccessObject daoProducts = new Products();
		daoProducts.run();
	}
}