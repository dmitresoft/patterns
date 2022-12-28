package com.sukhovilin.patterns.gof.behavioral.Command.structural;

/**
 * The 'ConcreteCommand' class
 */
public class ConcreteCommand extends Command {

    // Constructor
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
