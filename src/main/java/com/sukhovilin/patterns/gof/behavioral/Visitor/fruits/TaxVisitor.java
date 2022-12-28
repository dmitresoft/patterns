package com.sukhovilin.patterns.gof.behavioral.Visitor.fruits;

interface TaxVisitor {
	void setTax(double tax);
	double getTotalTax();
}
