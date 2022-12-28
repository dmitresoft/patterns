package com.sukhovilin.patterns.gof.creational.Prototype.realworld;

/**
 * The 'ConcretePrototype' class
 */
class Color extends ColorPrototype {
	private int _red;
	private int _green;
	private int _blue;

	// Constructor
	public Color(int red, int green, int blue) {
		this._red = red;
		this._green = green;
		this._blue = blue;
	}

	// Create a shallow copy
	@Override
	public ColorPrototype Clone() throws CloneNotSupportedException {
		System.out.println(String.format("Cloning color RGB: %s,\t%s,\t%s", _red, _green, _blue));
		return (ColorPrototype) clone();
	}
}