package com.sukhovilin.patterns.gof.structural.Bridge.realworld;

/**
 * The 'RefinedAbstraction' class
 */
class Customers extends CustomersBase {
	// Constructor
	public Customers(String group) {
		super(group);
	}

	@Override
	public void ShowAll() {
		// Add separator lines
		System.out.println();
		System.out.println("------------------------");
		super.ShowAll();
		System.out.println("------------------------");
	}
}