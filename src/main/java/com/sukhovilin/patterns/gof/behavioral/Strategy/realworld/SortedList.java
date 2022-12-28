package com.sukhovilin.patterns.gof.behavioral.Strategy.realworld;

import java.util.ArrayList;
import java.util.List;

/**
 * The 'Context' class
 */
class SortedList {
	private List<String> list = new ArrayList<String>();
	private SortStrategy sortstrategy;

	public void setSortStrategy(SortStrategy sortstrategy) {
		this.sortstrategy = sortstrategy;
	}

	public void add(String name) {
		list.add(name);
	}

	public void sort() {
		sortstrategy.sort(list);
		// Iterate over list and display results
		for (String name : list) {
			System.out.println(" " + name);
		}
		System.out.println();
	}
}