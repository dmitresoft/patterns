package com.sukhovilin.patterns.gof.behavioral.Command.structural;

/**
 * Command Design Pattern
 * <p>
 * Encapsulate a request as an object, thereby letting you parameterize clients with different requests,
 * queue or log requests, and support undoable operations.
 * </p>
 * <p>
 * The classes and/or objects participating in this pattern are:
 * Command (Command)
 * - declares an interface for executing an operation
 * ConcreteCommand (CalculatorCommand)
 * - defines a binding between a Receiver object and an action
 * - implements Execute by invoking the corresponding operation(s) on Receiver
 * Client (CommandApp)
 * - creates a ConcreteCommand object and sets its receiver
 * Invoker (User)
 * - asks the command to carry out the request
 * Receiver (Calculator)
 * - knows how to perform the operations associated with carrying out the request.
 * </p>
 * Author: Dmitry Sukhovilin
 * Date: Sep 10, 2010
 * Time: 2:48:33 AM
 */
public class Program {

    public static void main(String[] args) {

        // Create receiver, command, and invoker
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();

        // Set and execute command
        invoker.setCommand(command);
        invoker.executeCommand();
    }
    
}
