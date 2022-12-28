package com.sukhovilin.patterns.gof.structural.Decorator.mydemo;

/**
 * The 'Decorator' abstract class
 */
public abstract class Decorator extends Component {
	protected Component component;

	public Decorator(Component component) {

		this.component = component;
	}

	@Override
	public void Operation() {
		component.Operation();
	}
}
