package com.sukhovilin.patterns.gof.behavioral.Strategy.structural;

/**
 * A 'ConcreteStrategy' class
 */
class ConcreteStrategyA extends Strategy {
	@Override
	public void algorithmInterface() {
		System.out.println("Called ConcreteStrategyA.AlgorithmInterface()");
	}
}