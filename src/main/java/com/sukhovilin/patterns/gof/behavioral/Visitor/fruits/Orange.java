package com.sukhovilin.patterns.gof.behavioral.Visitor.fruits;

class Orange implements PriceVisitable, TaxVisitable {

	@Override
	public void accept(PriceVisitor visitor) {
		visitor.setPrice(13);
	}

	@Override
	public void accept(TaxVisitor visitor) {
		visitor.setTax(1.3);
	}

}