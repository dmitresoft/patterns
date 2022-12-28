package com.sukhovilin.patterns.gof.behavioral.Memento.realworld;

/**
 * The 'Originator' class
 */
class SalesProspect {
	private String name;
	private String phone;
	private double budget;

	// Gets or sets name
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Name:  " + this.name);
	}

	// Gets or sets phone
	public String Phone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		System.out.println("Phone: " + this.phone);
	}

	// Gets or sets budget
	public double getBudget() {
		return this.budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
		System.out.println("Budget: " + this.budget);
	}

	// Stores memento
	public SalesProspectMemento saveMemento() {
		System.out.println("\nSaving state --\n");
		return new SalesProspectMemento(name, phone, budget);
	}

	// Restores memento
	public void restoreMemento(SalesProspectMemento memento) {
		System.out.println("\nRestoring state --\n");
		setName(memento.getName());
		setPhone(memento.getPhone());
		setBudget(memento.getBudget());
	}
}