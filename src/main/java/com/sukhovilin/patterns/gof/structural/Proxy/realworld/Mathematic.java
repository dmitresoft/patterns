package com.sukhovilin.patterns.gof.structural.Proxy.realworld;

/**
 * The 'Subject interface
 */
interface Mathematic {
	double add(double x, double y);

	double sub(double x, double y);

	double mul(double x, double y);

	double div(double x, double y);
}