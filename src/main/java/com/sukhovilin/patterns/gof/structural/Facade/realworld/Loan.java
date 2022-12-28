package com.sukhovilin.patterns.gof.structural.Facade.realworld;

/**
 * The 'Subsystem ClassC' class
 */
class Loan {
	public boolean hasNoBadLoans(Customer c) {
		System.out.println("Check loans for " + c.getName());
		return true;
	}
}