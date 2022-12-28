package com.sukhovilin.patterns.gof.structural.Facade.realworld;

/**
 * The 'Subsystem ClassB' class
 */
class Credit {
	public boolean hasGoodCredit(Customer c) {
		System.out.println("Check credit for " + c.getName());
		return true;
	}
}