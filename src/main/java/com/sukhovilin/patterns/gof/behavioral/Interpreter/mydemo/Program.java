package com.sukhovilin.patterns.gof.behavioral.Interpreter.mydemo;

/**
 * State + Interpreter demo
 * @author Dmitry Sukhovilin
 */
class Program {

	public static void main(String[] args) {
		String value = "ABCBCACC";
		Context context = new Context(value);

		Expression exp = new ExpressionA();
		while (context.hasMore()) {
			exp.interpret(context);
			// we use the state pattern to change a concrete interpreter
			exp = exp.getNextExpression();
		}
	}

}