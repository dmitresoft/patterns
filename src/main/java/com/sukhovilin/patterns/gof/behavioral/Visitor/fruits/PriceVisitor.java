package com.sukhovilin.patterns.gof.behavioral.Visitor.fruits;

interface PriceVisitor {

	void setPrice(double price);

	double getTotalPrice();
}