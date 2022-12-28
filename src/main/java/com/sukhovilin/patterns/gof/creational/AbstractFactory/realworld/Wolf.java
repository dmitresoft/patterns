package com.sukhovilin.patterns.gof.creational.AbstractFactory.realworld;

import static java.lang.System.out;

/**
 * The 'ProductB2' class
 */
class Wolf extends Carnivore {

	@Override
	public void Eat(Herbivore h) {
		// Eat Bison
		out.println(this.getClass().getSimpleName() + " eats " + h.getClass().getSimpleName());
	}

}