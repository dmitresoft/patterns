package com.sukhovilin.patterns.gof.behavioral.Interpreter.structural;

import java.util.ArrayList;
import java.util.List;

/**
 * MainApp startup class for Structural Interpreter Design Pattern.
 */
public class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		Context context = new Context();
		// Usually a tree
		List<AbstractExpression> list = new ArrayList<AbstractExpression>();

		// Populate 'abstract syntax tree'
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());

		// Interpret
		for (AbstractExpression exp : list) {
			exp.Interpret(context);
		}
	}
}
