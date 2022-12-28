package com.sukhovilin.patterns.gof.behavioral.Visitor.fruits;

class Apple implements PriceVisitable, TaxVisitable {

	@Override
	public void accept(PriceVisitor visitor) {
		visitor.setPrice(11);
	}

	@Override
	public void accept(TaxVisitor visitor) {
		visitor.setTax(1.1);
	}

}
