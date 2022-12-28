package com.sukhovilin.patterns.gof.behavioral.Observer.realworld;

public class Program {

	public static void main(String[] args) {

		// Create IBM stock and attach investors
		IBM ibm = new IBM("IBM", 120.00);
		ibm.attach(new Investor("Sorros"));
		ibm.attach(new Investor("Berkshire"));

		// Fluctuating prices will notify investors
		ibm.setPrice(120.10);
		ibm.setPrice(121.00);
		ibm.setPrice(120.50);
		ibm.setPrice(120.75);
	}
}
