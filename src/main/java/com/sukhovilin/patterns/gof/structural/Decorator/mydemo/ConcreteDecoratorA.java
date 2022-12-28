package com.sukhovilin.patterns.gof.structural.Decorator.mydemo;

/**
 * The 'ConcreteDecoratorA' class
 */
public class ConcreteDecoratorA extends Decorator {
	
	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	@Override
	public void Operation() {
		super.Operation();
		System.out.println("ConcreteDecoratorA.Operation()");

	}
}
