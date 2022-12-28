package com.sukhovilin.patterns.gof.behavioral.Interpreter.mydemo;

class ExpressionB extends Expression {

	@Override
	void interpret(Context context) {
		char c = context.getNext();
		if (c == 'B') {
			context.inc();
			System.out.println("got B");
		}
	}

	@Override
	Expression getNextExpression() {
		return new ExpressionC();
	}
}