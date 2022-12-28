package com.sukhovilin.patterns.gof.structural.Flyweight.realworld;

import java.util.Hashtable;
import java.util.Map;

/**
 * The 'FlyweightFactory' class
 */
class CharacterFactory {
	private Map<Character, Symbol> symbols = new Hashtable<Character, Symbol>();

	public Symbol GetCharacter(char key) {
		// Uses "lazy initialization"
		Symbol symbol = null;
		if (symbols.containsKey(key)) {
			symbol = symbols.get(key);
		} else {

			switch (key) {
			case 'A':
				symbol = new SymbolA();
				break;
			case 'B':
				symbol = new SymbolB();
				break;
			// ...
			case 'Z':
				symbol = new SymbolZ();
				break;
			}
			symbols.put(new java.lang.Character(key), symbol);
		}
		return symbol;
	}
}