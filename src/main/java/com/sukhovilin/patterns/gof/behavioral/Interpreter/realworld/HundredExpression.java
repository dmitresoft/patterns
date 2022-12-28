package com.sukhovilin.patterns.gof.behavioral.Interpreter.realworld;

/**
 * A 'TerminalExpression' class <i>Hundred checks C, CD, D or CM</i>
 */
class HundredExpression extends Expression {
	@Override
	public String One() {
		return "C";
	}

	@Override
	public String Four() {
		return "CD";
	}

	@Override
	public String Five() {
		return "D";
	}

	@Override
	public String Nine() {
		return "CM";
	}

	@Override
	public int Multiplier() {
		return 100;
	}
}