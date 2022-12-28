package com.sukhovilin.patterns.gof.structural.Proxy.realworld;

/**
 * MainApp startup class for Real-World Proxy Design Pattern.
 * 
 * @author Dmitry Sukhovilin
 */
class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		// Create math proxy
		Mathematic proxy = new MathProxy();

		// Do the math
		System.out.println("4 + 2 = " + proxy.add(4, 2));
		System.out.println("4 - 2 = " + proxy.sub(4, 2));
		System.out.println("4 * 2 = " + proxy.mul(4, 2));
		System.out.println("4 / 2 = " + proxy.div(4, 2));
	}
}
