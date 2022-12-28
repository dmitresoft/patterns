package com.sukhovilin.patterns.gof.creational.FactoryMethod.simple;

/**
 * A 'ConcreteCreator' class
 */
class ConcreteCreatorA extends AbstractCreator {
	@Override
	public AbstractProduct FactoryMethod() {
		return new ConcreteProductA();
	}
}