package com.sukhovilin.patterns.gof.structural.Decorator.structural;

/**
 * MainApp startup class for Structural Decorator Design Pattern.
 */
public class Program {
	public static void main(String... args) {
		
		// Create ConcreteComponent and two Decorators
		ConcreteComponent c = new ConcreteComponent();
		ConcreteDecoratorA da = new ConcreteDecoratorA();
		ConcreteDecoratorB db = new ConcreteDecoratorB();
		
		// Link decorators
		// I'd use contructor to put the real object into a decorator
		da.SetComponent(c);
		db.SetComponent(da);
		db.Operation();
	}
}
