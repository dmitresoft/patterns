package com.sukhovilin.patterns.gof.behavioral.Strategy.structural;

/**
 * MainApp startup class for Structural Strategy Design Pattern.
 */
public class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		Context context;

		// Three contexts following different strategies
		context = new Context(new ConcreteStrategyA());
		context.ContextInterface();
		
		context = new Context(new ConcreteStrategyB());
		context.ContextInterface();
		
		context = new Context(new ConcreteStrategyC());
		context.ContextInterface();
	}
}