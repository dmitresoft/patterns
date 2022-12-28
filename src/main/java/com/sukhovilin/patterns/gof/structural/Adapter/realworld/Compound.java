package com.sukhovilin.patterns.gof.structural.Adapter.realworld;

/**
 * The 'Target' class
 */
class Compound {
	protected String chemical;
	protected float boilingPoint;
	protected float meltingPoint;
	protected double molecularWeight;
	protected String molecularFormula;

	// Constructor
	public Compound(String chemical) {
		this.chemical = chemical;
	}

	public void display() {
		System.out.println(String.format("\nCompound: %s ------ ", chemical));
	}
}