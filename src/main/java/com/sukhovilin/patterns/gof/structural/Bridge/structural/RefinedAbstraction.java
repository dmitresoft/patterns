package com.sukhovilin.patterns.gof.structural.Bridge.structural;

/**
 * The 'RefinedAbstraction' class
 */
class RefinedAbstraction extends Abstraction {
	@Override
	public void Operation() {
		implementor.Operation();
	}
}