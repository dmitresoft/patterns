package com.sukhovilin.patterns.gof.behavioral.Visitor.fruits;

class TaxVisitorImpl implements TaxVisitor {

	private double tax = 0;

	@Override
	public void setTax(double tax) {
		this.tax += tax;
	}

	@Override
	public double getTotalTax() {
		return this.tax;
	}

}