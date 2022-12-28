package com.sukhovilin.patterns.gof.behavioral.Strategy.structural;

/**
 * A 'ConcreteStrategy' class
 */
class ConcreteStrategyB extends Strategy {
	@Override
	public void algorithmInterface() {
		System.out.println("Called ConcreteStrategyB.AlgorithmInterface()");
	}
}