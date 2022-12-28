package com.sukhovilin.patterns.gof.structural.Flyweight.realworld;

/**
 * A 'ConcreteFlyweight' class
 */
class SymbolZ extends Symbol {
	// Constructor
	public SymbolZ() {
		this.symbol = 'Z';
		this.height = 100;
		this.width = 100;
		this.ascent = 68;
		this.descent = 0;
	}

	@Override
	public void Display(int pointSize) {
		this.pointSize = pointSize;
		System.out.println(this.symbol + " (pointsize " + this.pointSize + ")");
	}
}