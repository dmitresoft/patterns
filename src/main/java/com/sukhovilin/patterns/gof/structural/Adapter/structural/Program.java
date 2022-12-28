package com.sukhovilin.patterns.gof.structural.Adapter.structural;

/**
 * MainApp startup class for Structural Adapter Design Pattern.
 */
public class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		// Create adapter and place a request
		Target target = new Adapter();
		target.request();
	}
}
