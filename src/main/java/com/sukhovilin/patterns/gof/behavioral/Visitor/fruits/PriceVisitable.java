package com.sukhovilin.patterns.gof.behavioral.Visitor.fruits;

interface PriceVisitable {
	void accept(PriceVisitor visitor);
}
