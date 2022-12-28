package com.sukhovilin.patterns.gof.behavioral.Observer.structural;

/**
 * 'ConcreteSubject' class
 */
class ConcreteSubject extends Subject {
	
	private String subjectState;

	// Gets or sets subject state
	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}

}