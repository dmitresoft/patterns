package com.sukhovilin.patterns.gof.behavioral.Interpreter.codelabru;

class Program {

	public static void main(String[] args) {
		// Часть 1:
		BooleanExp expression;
		Context context = new Context();
		VariableExp x = new VariableExp("X");
		VariableExp y = new VariableExp("Y");
		expression = new OrExp(new AndExp(new Constant(true), x), new AndExp(y, new NotExp(x)));
		context.Assign(x, false);
		context.Assign(y, true);
		boolean result = expression.Evaluate(context);
		System.out.println(result);

		// Часть 2: замена значения y
		// NotExp not_z = new NotExp(z) ;
		// BooleanExp replacement = expression.Replace("Y", not_z);
		// ??context.Assign(not_z, true);
		// result = replacement.Evaluate(context);
		// System.out.println(result);
	}
}