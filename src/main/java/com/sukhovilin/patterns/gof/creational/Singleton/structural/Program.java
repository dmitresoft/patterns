package com.sukhovilin.patterns.gof.creational.Singleton.structural;

/**
 * MainApp startup class for Structural Singleton Design Pattern.
 */
class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		// Constructor is protected -- cannot use new
		Singleton s1 = Singleton.Instance();
		Singleton s2 = Singleton.Instance();

		// Test for same instance
		if (s1 == s2) {
			System.out.println("Objects are the same instance");
		}
	}
}