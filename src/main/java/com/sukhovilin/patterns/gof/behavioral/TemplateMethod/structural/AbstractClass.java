package com.sukhovilin.patterns.gof.behavioral.TemplateMethod.structural;

/**
 * The 'AbstractClass' abstract class
 */
abstract class AbstractClass {
	public abstract void primitiveOperation1();

	public abstract void primitiveOperation2();

	// The "Template method"
	public void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
		System.out.println();
	}
}