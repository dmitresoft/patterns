package com.sukhovilin.patterns.gof.behavioral.TemplateMethod.realworld;

import java.util.HashSet;

/**
 * A 'ConcreteClass' class
 */
class Products extends DataAccessObject {
	@Override
	public void Select() {
		dataSet = new HashSet<String>();
		// fill
		dataSet.add("ONE");
		dataSet.add("TWO");
		dataSet.add("THREE");
	}

	@Override
	public void Process() {
		System.out.println("Products ---- ");
		for (String row : dataSet) {
			System.out.println(row);
		}
		System.out.println();
	}
}