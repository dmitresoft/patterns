package com.sukhovilin.patterns.gof.structural.Flyweight.realworld;

/**
 * The 'Flyweight' abstract class
 */
abstract class Symbol {
	protected char symbol;
	protected int width;
	protected int height;
	protected int ascent;
	protected int descent;
	protected int pointSize;

	public abstract void Display(int pointSize);
}