package com.sukhovilin.patterns.gof.behavioral.Command.realworld;

/**
 * The 'Command' abstract class
 */
abstract class Command {
	protected Receiver receiver;

	// Constructor
	public Command(Receiver receiver) {
		this.receiver = receiver;
	}

	public abstract void Execute();
}