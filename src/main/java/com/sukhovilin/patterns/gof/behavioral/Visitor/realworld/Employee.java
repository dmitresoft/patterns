package com.sukhovilin.patterns.gof.behavioral.Visitor.realworld;

/**
 * The 'ConcreteElement' class
 */
abstract class Employee extends Element {
	private String name;
	private double income;
	private int vacationDays;

	// Constructor
	public Employee(String name, double income, int vacationDays) {
		this.name = name;
		this.income = income;
		this.vacationDays = vacationDays;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}