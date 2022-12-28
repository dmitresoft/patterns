package com.sukhovilin.patterns.gof.structural.Facade.realworld;

/**
 * MainApp startup class for Real-World Facade Design Pattern.
 */
public class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		// Facade
		Mortgage mortgage = new Mortgage();

		// Evaluate mortgage eligibility for customer
		Customer customer = new Customer("Ann McKinsey");
		boolean eligible = mortgage.IsEligible(customer, 125000);
		System.out.println("\n" + customer.getName() + " has been " + (eligible ? "Approved" : "Rejected"));
	}
}