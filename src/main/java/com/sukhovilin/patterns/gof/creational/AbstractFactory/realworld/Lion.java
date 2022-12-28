package com.sukhovilin.patterns.gof.creational.AbstractFactory.realworld;

import static java.lang.System.out;

/**
 * The 'ProductB1' class
 */
class Lion extends Carnivore {

	@Override
	public void Eat(Herbivore h) {
		// Eat Wildebeest
		out.println(this.getClass().getSimpleName() + " eats " + h.getClass().getSimpleName());
	}

}