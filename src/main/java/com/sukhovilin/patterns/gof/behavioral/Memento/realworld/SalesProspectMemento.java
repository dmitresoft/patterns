package com.sukhovilin.patterns.gof.behavioral.Memento.realworld;

/**
 * The 'Memento' class
 */
class SalesProspectMemento {
	private String name;
	private String phone;
	private double budget;

	// Constructor
	public SalesProspectMemento(String name, String phone, double budget) {
		this.name = name;
		this.phone = phone;
		this.budget = budget;
	}

	// Gets or sets name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Gets or set phone
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// Gets or sets budget
	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}
}