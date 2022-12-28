package com.sukhovilin.patterns.gof.behavioral.Interpreter.mydemo;

class ExpressionA extends Expression {

	@Override
	void interpret(Context context) {
		char c = context.getNext();
		if (c == 'A') {
			context.inc();
			System.out.println("got A");
		}
	}

	@Override
	Expression getNextExpression() {
		return new ExpressionB();
	}

}