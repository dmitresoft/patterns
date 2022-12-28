package com.sukhovilin.patterns.gof.behavioral.Mediator.realworld;

/**
 * The 'AbstractColleague' class
 */
class Participant {
	
	private Chatroom chatroom;
	private String name;

	// Constructor
	public Participant(String name) {
		this.name = name;
	}

	// Gets participant name
	public String getName() {
		return name;
	}

	// Gets chatroom
	public Chatroom getChatroom() {
		return chatroom;
	}

	public void setChatroom(Chatroom value) {
		chatroom = value;
	}

	// Sends message to given participant
	public void send(String to, String message) {
		chatroom.send(name, to, message);
	}

	// Receives message from given participant
	public void receive(String from, String message) {
		System.out.println(String.format("%s to %s: '%s'", from, getName(), message));
	}
}