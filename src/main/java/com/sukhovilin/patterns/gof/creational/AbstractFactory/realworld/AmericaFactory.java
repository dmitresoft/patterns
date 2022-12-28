package com.sukhovilin.patterns.gof.creational.AbstractFactory.realworld;

/**
 * The 'ConcreteFactory2' class
 */
class AmericaFactory extends ContinentFactory {

	@Override
	public Herbivore CreateHerbivore() {
		return new Bison();
	}

	@Override
	public Carnivore CreateCarnivore() {
		return new Wolf();
	}

}