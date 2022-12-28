package com.sukhovilin.patterns.gof.behavioral.Interpreter.codelabru;

class VariableExp implements BooleanExp {
	private String name;

	public VariableExp(String name) {
		this.name = name;
	}

	public boolean Evaluate(Context c) {
		return c.Lookup(name);
	}

	public BooleanExp Copy() {
		return new VariableExp(name);
	}

	public BooleanExp Replace(String name, BooleanExp exp) {
		if (this.name.equals(name)) {
			return exp.Copy();
		} else {
			return Copy();
		}
	}

	public String getName() {
		return name;
	}
}