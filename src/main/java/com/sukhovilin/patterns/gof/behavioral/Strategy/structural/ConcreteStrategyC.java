package com.sukhovilin.patterns.gof.behavioral.Strategy.structural;

/**
 * A 'ConcreteStrategy' class
 */
class ConcreteStrategyC extends Strategy {
	@Override
	public void algorithmInterface() {
		System.out.println("Called ConcreteStrategyC.AlgorithmInterface()");
	}
}