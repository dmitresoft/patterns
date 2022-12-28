package com.sukhovilin.patterns.gof.structural.Flyweight.realworld;

/**
 * A 'ConcreteFlyweight' class
 */
class SymbolB extends Symbol {
	// Constructor
	public SymbolB() {
		this.symbol = 'B';
		this.height = 100;
		this.width = 140;
		this.ascent = 72;
		this.descent = 0;
	}

	@Override
	public void Display(int pointSize) {
		this.pointSize = pointSize;
		System.out.println(this.symbol + " (pointsize " + this.pointSize + ")");
	}
}