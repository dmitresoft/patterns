package com.sukhovilin.patterns.gof.behavioral.Strategy.structural;

/**
 * The 'Context' class
 */
class Context {
	private Strategy strategy;

	// Constructor
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void ContextInterface() {
		strategy.algorithmInterface();
	}
}