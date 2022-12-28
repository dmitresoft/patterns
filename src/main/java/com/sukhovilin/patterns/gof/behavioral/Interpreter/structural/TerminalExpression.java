package com.sukhovilin.patterns.gof.behavioral.Interpreter.structural;

/**
 * The 'TerminalExpression' class
 */
class TerminalExpression extends AbstractExpression {
	@Override
	public void Interpret(Context context) {
		System.out.println("Called Terminal.Interpret()");
	}
}