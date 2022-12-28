package com.sukhovilin.patterns.gof.behavioral.Strategy.realworld;

import java.util.List;

/**
 * A 'ConcreteStrategy' class
 */
class MergeSort extends SortStrategy {
	@Override
	public void sort(List<String> list) {
		// list.MergeSort(); not-implemented
		System.out.println("MergeSorted list ");
	}
}