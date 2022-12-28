package com.sukhovilin.patterns.gof.behavioral.Command.structural;

/**
 * The 'Invoker' class
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
