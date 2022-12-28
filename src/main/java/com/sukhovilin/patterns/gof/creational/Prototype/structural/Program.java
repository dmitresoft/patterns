package com.sukhovilin.patterns.gof.creational.Prototype.structural;

/**
 * MainApp startup class for Structural Prototype Design Pattern.
 */
class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		try {

			// Create two instances and clone each
			ConcretePrototype1 p1 = new ConcretePrototype1("I");
			ConcretePrototype1 c1 = (ConcretePrototype1) p1.cloneMe();
			System.out.println("Cloned: " + c1.getId());

			ConcretePrototype2 p2 = new ConcretePrototype2("II");
			ConcretePrototype2 c2 = (ConcretePrototype2) p2.cloneMe();
			System.out.println("Cloned: " + c2.getId());

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}