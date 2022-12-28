package com.sukhovilin.patterns.gof.behavioral.Strategy.realworld;

import java.util.Collections;
import java.util.List;

/**
 * A 'ConcreteStrategy' class
 */
class QuickSort extends SortStrategy {
	@Override
	public void sort(List<String> list) {
		// !! list.Sort(); // Default is Quicksort
		Collections.sort(list);
		System.out.println("QuickSorted list ");
	}
}