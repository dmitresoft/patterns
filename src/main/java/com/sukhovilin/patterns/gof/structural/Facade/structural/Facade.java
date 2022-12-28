package com.sukhovilin.patterns.gof.structural.Facade.structural;

/**
 * The 'Facade' class
 */
class Facade {
	private SubSystemOne one;
	private SubSystemTwo two;
	private SubSystemThree three;
	private SubSystemFour four;

	public Facade() {
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
		four = new SubSystemFour();
	}

	public void MethodA() {
		System.out.println("\nMethodA() ---- ");
		one.methodOne();
		two.methodTwo();
		four.methodFour();
	}

	public void MethodB() {
		System.out.println("\nMethodB() ---- ");
		two.methodTwo();
		three.methodThree();

	}
}