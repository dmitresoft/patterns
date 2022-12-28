package com.sukhovilin.patterns.gof.structural.Bridge.structural;

/**
 * The 'ConcreteImplementorB' class
 */
class ConcreteImplementorB extends Implementor {
	@Override
	public void Operation() {
		System.out.println("ConcreteImplementorB Operation");
	}
}