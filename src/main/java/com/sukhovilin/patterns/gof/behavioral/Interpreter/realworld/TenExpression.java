package com.sukhovilin.patterns.gof.behavioral.Interpreter.realworld;

/**
 * A 'TerminalExpression' class <i>Ten checks for X, XL, L and XC</i>
 */
class TenExpression extends Expression {
	@Override
	public String One() {
		return "X";
	}

	@Override
	public String Four() {
		return "XL";
	}

	@Override
	public String Five() {
		return "L";
	}

	@Override
	public String Nine() {
		return "XC";
	}

	@Override
	public int Multiplier() {
		return 10;
	}
}