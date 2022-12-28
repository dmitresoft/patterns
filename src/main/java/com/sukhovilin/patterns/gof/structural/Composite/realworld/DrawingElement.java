package com.sukhovilin.patterns.gof.structural.Composite.realworld;

/**
 * The 'Component' Treenode
 */
abstract class DrawingElement {
	protected String name;

	// Constructor
	public DrawingElement(String name) {
		this.name = name;
	}

	public abstract void Add(DrawingElement d);

	public abstract void Remove(DrawingElement d);

	public abstract void Display(int indent);
}