package com.sukhovilin.patterns.gof.creational.AbstractFactory.structural;

/**
 * The 'ConcreteFactory2' class
 */
class ConcreteFactory2 extends AbstractFactory {

	@Override
	public AbstractProductA CreateProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB CreateProductB() {
		return new ProductB2();
	}
}
