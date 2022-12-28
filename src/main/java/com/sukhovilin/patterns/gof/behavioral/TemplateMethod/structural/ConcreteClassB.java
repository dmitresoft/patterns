package com.sukhovilin.patterns.gof.behavioral.TemplateMethod.structural;

/**
 * A 'ConcreteClass' class
 */
class ConcreteClassB extends AbstractClass {
	@Override
	public void primitiveOperation1() {
		System.out.println("ConcreteClassB.PrimitiveOperation1()");
	}

	@Override
	public void primitiveOperation2() {
		System.out.println("ConcreteClassB.PrimitiveOperation2()");
	}
}