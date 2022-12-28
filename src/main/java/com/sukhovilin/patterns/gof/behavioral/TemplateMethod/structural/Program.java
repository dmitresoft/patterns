package com.sukhovilin.patterns.gof.behavioral.TemplateMethod.structural;

/**
 * MainApp startup class for Real-World Template Design Pattern.
 */
class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		AbstractClass a = new ConcreteClassA();
		a.templateMethod();
		
		AbstractClass b = new ConcreteClassB();
		b.templateMethod();
	}
}