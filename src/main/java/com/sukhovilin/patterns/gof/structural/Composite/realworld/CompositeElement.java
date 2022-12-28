package com.sukhovilin.patterns.gof.structural.Composite.realworld;

import java.util.LinkedList;
import java.util.List;

/**
 * The 'Composite' class
 */
class CompositeElement extends DrawingElement {
	private List<DrawingElement> elements = new LinkedList<DrawingElement>();

	// Constructor
	public CompositeElement(String name) {
		super(name);
	}

	@Override
	public void Add(DrawingElement d) {
		elements.add(d);
	}

	@Override
	public void Remove(DrawingElement d) {
		elements.remove(d);
	}

	@Override
	public void Display(int indent) {
		System.out.println(new StringCopy('-', indent) + "+ " + name);
		// Display each child element on this node
		for (DrawingElement d : elements) {
			d.Display(indent + 2);
		}
	}
}