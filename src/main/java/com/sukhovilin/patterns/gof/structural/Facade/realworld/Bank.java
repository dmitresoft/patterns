package com.sukhovilin.patterns.gof.structural.Facade.realworld;

/**
 * The 'Subsystem ClassA' class
 */
class Bank {
	public boolean HasSufficientSavings(Customer c, int amount) {
		System.out.println("Check bank for " + c.getName());
		return true;
	}
}