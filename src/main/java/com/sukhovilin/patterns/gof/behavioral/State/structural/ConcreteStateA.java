package com.sukhovilin.patterns.gof.behavioral.State.structural;

/**
 * A 'ConcreteState' class
 */
class ConcreteStateA extends State {
	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateB());
	}
}