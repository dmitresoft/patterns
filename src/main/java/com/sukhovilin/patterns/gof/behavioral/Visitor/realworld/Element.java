package com.sukhovilin.patterns.gof.behavioral.Visitor.realworld;

/**
 * The 'Element' abstract class
 */
abstract class Element {
	public abstract void accept(Visitor visitor);
}