package com.sukhovilin.patterns.gof.behavioral.Memento.realworld;

/**
 * The 'Caretaker' class
 */
class ProspectMemory {
	private SalesProspectMemento memento;

	// Property
	public SalesProspectMemento getMemento() {
		return this.memento;
	}

	public void setMemento(SalesProspectMemento memento) {
		this.memento = memento;
	}
}