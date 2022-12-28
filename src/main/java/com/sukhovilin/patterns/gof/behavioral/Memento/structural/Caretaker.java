package com.sukhovilin.patterns.gof.behavioral.Memento.structural;

/**
 * The 'Caretaker' class
 */
class Caretaker {
	private Memento _memento;

	// Gets or sets memento
	public Memento getMemento() {
		return _memento;
	}

	public void setMemento(Memento memento) {
		_memento = memento;
	}
}