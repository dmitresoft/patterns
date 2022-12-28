package com.sukhovilin.patterns.gof.behavioral.Interpreter.realworld;

/**
 * A 'TerminalExpression' class <i>Thousand checks for the Roman Numeral M</i>
 */
class ThousandExpression extends Expression {
	@Override
	public String One() {
		return "M";
	}

	@Override
	public String Four() {
		return " ";
	}

	@Override
	public String Five() {
		return " ";
	}

	@Override
	public String Nine() {
		return " ";
	}

	@Override
	public int Multiplier() {
		return 1000;
	}
}