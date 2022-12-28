package com.sukhovilin.patterns.gof.creational.AbstractFactory.realworld;

/**
 * The 'ConcreteFactory1' class
 */
class AfricaFactory extends ContinentFactory {

	@Override
	public Herbivore CreateHerbivore() {
		return new Wildebeest();
	}

	@Override
	public Carnivore CreateCarnivore() {
		return new Lion();
	}

}