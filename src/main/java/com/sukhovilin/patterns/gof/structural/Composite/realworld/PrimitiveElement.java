package com.sukhovilin.patterns.gof.structural.Composite.realworld;

/**
 * The 'Leaf' class
 */
class PrimitiveElement extends DrawingElement {
	// Constructor
	public PrimitiveElement(String name) {
		super(name);
	}

	@Override
	public void Add(DrawingElement c) {
		System.out.println("Cannot add to a PrimitiveElement");
	}

	@Override
	public void Remove(DrawingElement c) {
		System.out.println("Cannot remove from a PrimitiveElement");
	}

	@Override
	public void Display(int indent) {
		System.out.println(new StringCopy('-', indent) + " " + name);
	}
}