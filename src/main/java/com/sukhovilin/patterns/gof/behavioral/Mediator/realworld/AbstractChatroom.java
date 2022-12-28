package com.sukhovilin.patterns.gof.behavioral.Mediator.realworld;

/**
 * The 'Mediator' abstract class
 */
abstract class AbstractChatroom {
	
	public abstract void register(Participant participant);

	public abstract void send(String from, String to, String message);
	
}