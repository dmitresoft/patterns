package com.sukhovilin.patterns.gof.behavioral.State.structural;

/**
 * A 'ConcreteState' class
 */
class ConcreteStateB extends State {
	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateA());
	}
}