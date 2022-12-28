package com.sukhovilin.patterns.gof.behavioral.Command.realworld;

/**
 * MainApp startup class for Structural Command Design Pattern.
 * @author Dmitry Sukhovilin
 */
class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {

		// Create receiver, command, and invoker
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker();

		// Set and execute command
		invoker.SetCommand(command);
		invoker.ExecuteCommand();
	}
}