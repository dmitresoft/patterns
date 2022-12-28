package com.sukhovilin.patterns.gof.creational.FactoryMethod.simple;

/**
 * A 'ConcreteCreator' class
 */
class ConcreteCreatorB extends AbstractCreator {
	@Override
	public AbstractProduct FactoryMethod() {
		return new ConcreteProductB();
	}
}