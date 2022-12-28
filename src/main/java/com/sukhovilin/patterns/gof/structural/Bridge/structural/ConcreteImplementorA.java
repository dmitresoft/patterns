package com.sukhovilin.patterns.gof.structural.Bridge.structural;

/**
 * The 'ConcreteImplementorA' class
 */
class ConcreteImplementorA extends Implementor {
	@Override
	public void Operation() {
		System.out.println("ConcreteImplementorA Operation");
	}
}