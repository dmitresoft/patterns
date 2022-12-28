package com.sukhovilin.patterns.gof.structural.Flyweight.structural;

/**
 * The 'ConcreteFlyweight' class
 */
class ConcreteFlyweight extends Flyweight {
	@Override
	public void operation(int extrinsicstate) {
		System.out.println("ConcreteFlyweight: " + extrinsicstate);
	}
}