package com.sukhovilin.patterns.gof.behavioral.Interpreter.mydemo;

class ExpressionC extends Expression {

	@Override
	void interpret(Context context) {
		char c = context.getNext();
		if (c == 'C') {
			context.inc();
			System.out.println("got C");
		}
	}

	@Override
	Expression getNextExpression() {
		return new ExpressionA();
	}
}