package com.sukhovilin.patterns.gof.structural.Proxy.realworld;

/**
 * The 'RealSubject' class.
 */
class Math implements Mathematic {
	public double add(double x, double y) {
		return x + y;
	}

	public double sub(double x, double y) {
		return x - y;
	}

	public double mul(double x, double y) {
		return x * y;
	}

	public double div(double x, double y) {
		return x / y;
	}
}