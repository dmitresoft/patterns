package com.sukhovilin.patterns.gof.behavioral.Mediator.structural;

/**
 * The 'ConcreteMediator' class
 */
class ConcreteMediator extends Mediator {
	private ConcreteColleague1 colleague1;
	private ConcreteColleague2 colleague2;

	public void setColleague1(ConcreteColleague1 value) {
		colleague1 = value;
	}

	public void setColleague2(ConcreteColleague2 value) {
		colleague2 = value;
	}

	@Override
	public void send(String message, Colleague colleague) {
		if (colleague == colleague1) {
			colleague2.notify(message);
		} else {
			colleague1.notify(message);
		}
	}
}