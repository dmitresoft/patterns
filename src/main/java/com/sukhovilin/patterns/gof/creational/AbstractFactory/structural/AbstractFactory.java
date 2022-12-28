package com.sukhovilin.patterns.gof.creational.AbstractFactory.structural;

/**
 * The 'AbstractFactory' abstract class
 */
abstract class AbstractFactory {
	public abstract AbstractProductA CreateProductA();

	public abstract AbstractProductB CreateProductB();
}
