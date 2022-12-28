package com.sukhovilin.patterns.gof.structural.Decorator.mydemo;

/**
 * MainApp startup class for Structural Decorator Design Pattern.
 */
public class Program {
	public static void main(String... args) {
		
		// Create ConcreteComponent and two Decorators
		ConcreteComponent c = new ConcreteComponent();
		ConcreteDecoratorA da = new ConcreteDecoratorA(c);
		ConcreteDecoratorB db = new ConcreteDecoratorB(da);
		
		db.Operation();
	}
}
