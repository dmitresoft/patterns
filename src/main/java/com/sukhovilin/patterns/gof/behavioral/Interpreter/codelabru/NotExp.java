package com.sukhovilin.patterns.gof.behavioral.Interpreter.codelabru;

class NotExp implements BooleanExp {
	private BooleanExp operand;

	public NotExp(BooleanExp operand) {
		super();
		this.operand = operand;
	}

	public boolean Evaluate(Context c) {
		return !operand.Evaluate(c);
	}

	public BooleanExp Replace(String str, BooleanExp exp) {
		return new NotExp(operand.Replace(str, exp));
	}

	public BooleanExp Copy() {
		return new NotExp(operand.Copy());
	}
}