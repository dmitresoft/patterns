package com.sukhovilin.patterns.gof.behavioral.Command.realworld;

/**
 * The 'ConcreteCommand' class
 */
class ConcreteCommand extends Command {
	// Constructor
	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void Execute() {
		receiver.Action();
	}
}