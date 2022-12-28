package com.sukhovilin.patterns.gof.behavioral.TemplateMethod.realworld;

import java.util.HashSet;

/**
 * A 'ConcreteClass' class
 */
class Categories extends DataAccessObject {

	@Override
	public void Select() {
		dataSet = new HashSet<String>();
		// fill
		dataSet.add("one");
		dataSet.add("two");
		dataSet.add("three");
	}

	@Override
	public void Process() {
		System.out.println("Categories ---- ");
		for (String row : dataSet) {
			System.out.println(row);
		}
		System.out.println();
	}
}