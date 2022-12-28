package com.sukhovilin.patterns.gof.behavioral.Observer.structural;

/**
 * The 'ConcreteObserver' class
 */
class ConcreteObserver extends Observer {

	private String name;
	private String observerState;
	private ConcreteSubject subject;

	// Constructor
	public ConcreteObserver(ConcreteSubject subject, String name) {
		this.subject = subject;
		this.name = name;
	}

	@Override
	public void update() {
		observerState = subject.getSubjectState();
		System.out.println("Observer " + name + "'s new state is " + observerState);
	}

	// Gets or sets subject
	public ConcreteSubject getSubject() {
		return subject;
	}

	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}

}