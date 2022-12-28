package com.sukhovilin.patterns.gof.behavioral.Interpreter.realworld;

import java.util.LinkedList;
import java.util.List;

/**
 * MainApp startup class for Real-World Interpreter Design Pattern.
 */
public class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		String roman = "MCMXXVIII";
		Context context = new Context(roman);

		// Build the 'parse tree'
		List<Expression> tree = new LinkedList<Expression>();
		tree.add(new ThousandExpression());
		tree.add(new HundredExpression());
		tree.add(new TenExpression());
		tree.add(new OneExpression());

		// Interpret
		for (Expression exp : tree) {
			exp.Interpret(context);
		}
		System.out.println(String.format("%s = %s", roman, context.getOutput()));

	}
}