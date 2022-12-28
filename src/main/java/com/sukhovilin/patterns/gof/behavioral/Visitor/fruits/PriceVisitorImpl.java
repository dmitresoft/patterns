package com.sukhovilin.patterns.gof.behavioral.Visitor.fruits;

class PriceVisitorImpl implements PriceVisitor {

	private double price = 0;

	@Override
	public void setPrice(double price) {
		this.price += price;
	}

	@Override
	public double getTotalPrice() {
		return this.price;
	}

}