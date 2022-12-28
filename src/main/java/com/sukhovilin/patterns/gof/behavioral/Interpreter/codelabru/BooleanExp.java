package com.sukhovilin.patterns.gof.behavioral.Interpreter.codelabru;

interface BooleanExp {
	boolean Evaluate(Context c);

	BooleanExp Replace(String str, BooleanExp exp);

	BooleanExp Copy();
}