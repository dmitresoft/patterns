package com.sukhovilin.patterns.gof.behavioral.Visitor.fruits;

class Lemon implements PriceVisitable, TaxVisitable {

	@Override
	public void accept(PriceVisitor visitor) {
		visitor.setPrice(12);
	}

	@Override
	public void accept(TaxVisitor visitor) {
		visitor.setTax(1.2);
	}
}