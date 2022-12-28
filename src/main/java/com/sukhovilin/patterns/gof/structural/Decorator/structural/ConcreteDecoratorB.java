package com.sukhovilin.patterns.gof.structural.Decorator.structural;

/**
 * The 'ConcreteDecoratorB' class
 */
public class ConcreteDecoratorB extends Decorator {
	@Override
	public void Operation() {
		super.Operation();
		AddedBehavior();
		System.out.println("ConcreteDecoratorB.Operation()");
	}

	void AddedBehavior() {
	}

}
