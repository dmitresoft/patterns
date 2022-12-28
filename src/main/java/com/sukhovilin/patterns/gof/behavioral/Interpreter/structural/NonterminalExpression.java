package com.sukhovilin.patterns.gof.behavioral.Interpreter.structural;

/**
 * The 'NonterminalExpression' class
 */
class NonterminalExpression extends AbstractExpression {
	@Override
	public void Interpret(Context context) {
		System.out.println("Called Nonterminal.Interpret()");
	}
}