package com.sukhovilin.patterns.gof.creational.Prototype.realworld;


/**
 * MainApp startup class for Real-World Prototype Design Pattern.
 */
public class Program {

	/**
	 * Entry point into console application.
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ColorManager colormanager = new ColorManager();

		// Initialize with standard colors
		colormanager.set("red", new Color(255, 0, 0));
		colormanager.set("green", new Color(0, 255, 0));
		colormanager.set("blue", new Color(0, 0, 255));

		// User adds personalized colors
		colormanager.set("angry", new Color(255, 54, 0));
		colormanager.set("peace", new Color(128, 211, 128));
		colormanager.set("flame", new Color(211, 34, 20));

		try {
			// User clones selected colors
			Color color1 = (Color) colormanager.get("red").Clone();
			Color color2 = (Color) colormanager.get("peace").Clone();
			Color color3 = (Color) colormanager.get("flame").Clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}