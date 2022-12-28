package com.sukhovilin.patterns.gof.behavioral.Strategy.realworld;

import java.util.List;

/**
 * A 'ConcreteStrategy' class
 */
class ShellSort extends SortStrategy {
	@Override
	public void sort(List<String> list) {
		// list.ShellSort(); not-implemented
		System.out.println("ShellSorted list ");
	}
}