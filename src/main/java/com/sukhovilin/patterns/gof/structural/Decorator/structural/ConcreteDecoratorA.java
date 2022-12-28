package com.sukhovilin.patterns.gof.structural.Decorator.structural;

/**
 * The 'ConcreteDecoratorA' class
 */
public class ConcreteDecoratorA extends Decorator {
	@Override
	public void Operation() {
		super.Operation();
		System.out.println("ConcreteDecoratorA.Operation()");

	}
}
