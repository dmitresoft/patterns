package com.sukhovilin.patterns.gof.behavioral.Observer.structural;

import java.util.LinkedList;
import java.util.List;

/**
 * The 'Subject' abstract class
 */
abstract class Subject {

	private List<Observer> observers = new LinkedList<Observer>();

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	public void change() {
		for (Observer o : observers) {
			o.update();
		}
	}

}