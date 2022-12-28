package com.sukhovilin.patterns.gof.structural.Decorator.mydemo;

/**
 * The 'ConcreteDecoratorB' class
 */
public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public void Operation() {
		super.Operation();
		AddedBehavior();
		System.out.println("ConcreteDecoratorB.Operation()");
	}

	void AddedBehavior() {
	}

}
