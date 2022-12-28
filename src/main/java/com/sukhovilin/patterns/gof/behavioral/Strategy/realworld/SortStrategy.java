package com.sukhovilin.patterns.gof.behavioral.Strategy.realworld;

import java.util.List;

/**
 * The 'Strategy' abstract class
 */
abstract class SortStrategy {
	public abstract void sort(List<String> list);
}