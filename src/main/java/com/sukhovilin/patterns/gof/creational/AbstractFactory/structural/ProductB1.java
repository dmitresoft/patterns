package com.sukhovilin.patterns.gof.creational.AbstractFactory.structural;

import static java.lang.System.out;

/**
 * The 'ProductB1' class
 */
class ProductB1 extends AbstractProductB {

	@Override
	public void Interact(AbstractProductA a) {
		out.println(this.getClass().getSimpleName() + " interacts with " + a.getClass().getSimpleName());
	}

}
