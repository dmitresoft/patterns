package com.sukhovilin.patterns.gof.creational.FactoryMethod.simple;

/**
 * MainApp startup class for Structural Factory Method Design Pattern.
 */
public class Program {

	public static void main(String[] args) {
		// An array of creators
		AbstractCreator[] creators = new AbstractCreator[2];
		creators[0] = new ConcreteCreatorA();
		creators[1] = new ConcreteCreatorB();

		// Iterate over creators and create products
		for (AbstractCreator creator : creators) {
			AbstractProduct product = creator.FactoryMethod();
			System.out.println("Created " + product.getClass().getName());
		}
	}
}
