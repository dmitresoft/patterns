package com.sukhovilin.patterns.gof.creational.AbstractFactory.structural;

/**
 * The 'ConcreteFactory1' class
 */
class ConcreteFactory1 extends AbstractFactory {
	
	@Override
	public AbstractProductA CreateProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB CreateProductB() {
		return new ProductB1();
	}
}
