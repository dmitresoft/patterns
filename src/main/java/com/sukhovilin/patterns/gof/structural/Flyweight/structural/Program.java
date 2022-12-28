package com.sukhovilin.patterns.gof.structural.Flyweight.structural;

/**
 * MainApp startup class for Structural Flyweight Design Pattern
 */
public class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		
		// Arbitrary extrinsic state
		int extrinsicstate = 22;
		FlyweightFactory factory = new FlyweightFactory();
		
		// Work with different flyweight instances
		Flyweight fx = factory.GetFlyweight("X");
		fx.operation(--extrinsicstate);
		Flyweight fy = factory.GetFlyweight("Y");
		fy.operation(--extrinsicstate);
		Flyweight fz = factory.GetFlyweight("Z");
		fz.operation(--extrinsicstate);
		UnsharedConcreteFlyweight fu = new UnsharedConcreteFlyweight();
		fu.operation(--extrinsicstate);
	}
}