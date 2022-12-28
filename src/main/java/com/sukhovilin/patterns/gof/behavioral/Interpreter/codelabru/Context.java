package com.sukhovilin.patterns.gof.behavioral.Interpreter.codelabru;

import java.util.HashMap;
import java.util.Map;

class Context {
	Map<String, Boolean> vars = new HashMap<String, Boolean>();

	boolean Lookup(String name) {
		if (vars.get(name) == null)
			return false;
		return vars.get(name).booleanValue();
	}

	void Assign(VariableExp exp, boolean val) {
		vars.put(exp.getName(), val);
	}
}