package com.sukhovilin.patterns.gof.behavioral.Interpreter.realworld;

/**
 * A 'TerminalExpression' class <i>One checks for I, II, III, IV, V, VI, VI,
 * VII, VIII, IX</i>
 */
class OneExpression extends Expression {
	@Override
	public String One() {
		return "I";
	}

	@Override
	public String Four() {
		return "IV";
	}

	@Override
	public String Five() {
		return "V";
	}

	@Override
	public String Nine() {
		return "IX";
	}

	@Override
	public int Multiplier() {
		return 1;
	}
}