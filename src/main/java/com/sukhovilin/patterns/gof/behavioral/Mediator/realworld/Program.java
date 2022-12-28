package com.sukhovilin.patterns.gof.behavioral.Mediator.realworld;

/**
 * MainApp startup class for Real-World Mediator Design Pattern.
 * 
 * @author Dmitry Sukhovilin
 */
public class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {

		// Create chatroom
		Chatroom chatroom = new Chatroom();

		// Create participants and register them
		Participant george = new Beatle("George");
		Participant paul = new Beatle("Paul");
		Participant ringo = new Beatle("Ringo");
		Participant john = new Beatle("John");
		Participant yoko = new NonBeatle("Yoko");

		chatroom.register(george);
		chatroom.register(paul);
		chatroom.register(ringo);
		chatroom.register(john);
		chatroom.register(yoko);

		// Chatting participants
		yoko.send("John", "Hi John!");
		paul.send("Ringo", "All you need is love");
		ringo.send("George", "My sweet Lord");
		paul.send("John", "Can't buy me love");
		john.send("Yoko", "My sweet love");
	}

}