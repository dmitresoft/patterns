package com.sukhovilin.patterns.gof.creational.Prototype.realworld;

/**
 * The 'Prototype' abstract class
 */
abstract class ColorPrototype {
	public abstract ColorPrototype Clone() throws CloneNotSupportedException;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return this;
	}
}