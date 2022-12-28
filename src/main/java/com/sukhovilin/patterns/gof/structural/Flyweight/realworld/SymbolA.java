package com.sukhovilin.patterns.gof.structural.Flyweight.realworld;

/**
 * A 'ConcreteFlyweight' class
 */
class SymbolA extends Symbol {
	// Constructor
	public SymbolA() {
		this.symbol = 'A';
		this.height = 100;
		this.width = 120;
		this.ascent = 70;
		this.descent = 0;
	}

	@Override
	public void Display(int pointSize) {
		this.pointSize = pointSize;
		System.out.println(this.symbol + " (pointsize " + this.pointSize + ")");
	}
}