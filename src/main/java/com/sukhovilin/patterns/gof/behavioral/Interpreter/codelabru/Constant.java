package com.sukhovilin.patterns.gof.behavioral.Interpreter.codelabru;


class Constant implements BooleanExp {
	private boolean constant;

	public Constant(boolean constant) {
		super();
		this.constant = constant;
	}

	public BooleanExp Copy() {
		return new Constant(this.constant);
	}

	public boolean Evaluate(Context c) {
		return this.constant;
	}

	public BooleanExp Replace(String str, BooleanExp exp) {
		return Copy();
	}
}