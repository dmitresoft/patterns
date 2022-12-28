package com.sukhovilin.patterns.gof.behavioral.Visitor.realworld;


/**
 * MainApp startup class for Real-World Visitor Design Pattern.
 */
class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {

		// Setup employee collection
		Employees e = new Employees();
		e.attach(new Clerk());
		e.attach(new Director());
		e.attach(new President());

		// Employees are 'visited'
		e.accept(new IncomeVisitor());
		e.accept(new VacationVisitor());
	}
}
