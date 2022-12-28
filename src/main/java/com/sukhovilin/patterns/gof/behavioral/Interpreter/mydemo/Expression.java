package com.sukhovilin.patterns.gof.behavioral.Interpreter.mydemo;

abstract class Expression {
	abstract void interpret(Context conext);

	abstract Expression getNextExpression();
}