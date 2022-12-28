package com.sukhovilin.patterns.gof.structural.Flyweight.realworld;


/**
 * MainApp startup class for Real-World Flyweight Design Pattern.
 */
public class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {

		// Build a document with text
		String document = "AAZZBBZB";
		char[] chars = document.toCharArray();
		CharacterFactory factory = new CharacterFactory();

		// extrinsic state
		int pointSize = 10;

		// For each character use a flyweight object
		for (char c : chars) {
			pointSize++;
			Symbol character = factory.GetCharacter(c);
			character.Display(pointSize);
		}
	}
}