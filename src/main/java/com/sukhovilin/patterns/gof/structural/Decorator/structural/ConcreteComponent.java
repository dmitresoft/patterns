package com.sukhovilin.patterns.gof.structural.Decorator.structural;

/**
 * The 'ConcreteComponent' class
 */
public class ConcreteComponent extends Component {
	@Override
	public void Operation() {
		System.out.println("ConcreteComponent.Operation()");
	}
}
