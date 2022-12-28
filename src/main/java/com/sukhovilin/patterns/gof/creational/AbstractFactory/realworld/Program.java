package com.sukhovilin.patterns.gof.creational.AbstractFactory.realworld;

/**
 * Abstract Factory Design Pattern.
 */
public class Program {

	public static void main(String[] args) {

		// Create and run the African animal world
		ContinentFactory africa = new AfricaFactory();
		AnimalWorld world1 = new AnimalWorld(africa);
		world1.RunFoodChain();

		// Create and run the American animal world
		ContinentFactory america = new AmericaFactory();
		AnimalWorld world2 = new AnimalWorld(america);
		world2.RunFoodChain();
	}

}