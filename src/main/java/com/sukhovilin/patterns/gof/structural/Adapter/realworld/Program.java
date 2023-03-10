package com.sukhovilin.patterns.gof.structural.Adapter.realworld;

/**
 * MainApp startup class for Real-World Adapter Design Pattern.
 */
public class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		// Non-adapted chemical compound
		Compound unknown = new Compound("Unknown");
		unknown.display();

		// Adapted chemical compounds
		Compound water = new RichCompound("Water");
		water.display();
		Compound benzene = new RichCompound("Benzene");
		benzene.display();
		Compound ethanol = new RichCompound("Ethanol");
		ethanol.display();
	}
}