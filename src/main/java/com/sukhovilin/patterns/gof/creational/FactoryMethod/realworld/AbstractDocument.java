package com.sukhovilin.patterns.gof.creational.FactoryMethod.realworld;

import java.util.LinkedList;
import java.util.List;

/**
 * The 'Creator' abstract class
 */
abstract class AbstractDocument {
	private List<AbstractPage> pages = new LinkedList<AbstractPage>();

	// Constructor calls abstract Factory method
	public AbstractDocument() {
		this.createPages();
	}

	public List<AbstractPage> getPages() {
		return pages;
	}

	// Factory Method
	public abstract void createPages();
}