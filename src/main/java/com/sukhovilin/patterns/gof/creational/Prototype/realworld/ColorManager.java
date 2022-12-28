package com.sukhovilin.patterns.gof.creational.Prototype.realworld;

import java.util.HashMap;
import java.util.Map;

/**
 * Prototype manager
 */
class ColorManager {
	private Map<String, ColorPrototype> colors = new HashMap<String, ColorPrototype>();

	// Indexer
	public ColorPrototype get(String key) {
		return colors.get(key);
	}

	public void set(String key, ColorPrototype value) {
		colors.put(key, value);
	}

}