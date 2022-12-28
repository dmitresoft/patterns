package com.sukhovilin.patterns.gof.structural.Flyweight.structural;

/**
 * The 'UnsharedConcreteFlyweight' class
 */
class UnsharedConcreteFlyweight extends Flyweight {
	@Override
	public void operation(int extrinsicstate) {
		System.out.println("UnsharedConcreteFlyweight: " + extrinsicstate);
	}
}