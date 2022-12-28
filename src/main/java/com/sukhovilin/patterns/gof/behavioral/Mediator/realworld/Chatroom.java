package com.sukhovilin.patterns.gof.behavioral.Mediator.realworld;

import java.util.HashMap;
import java.util.Map;

/**
 * The 'ConcreteMediator' class
 */
class Chatroom extends AbstractChatroom {
	
	private Map<String, Participant> participants = new HashMap<String, Participant>();

	@Override
	public void register(Participant participant) {
		if (!participants.containsValue(participant)) {
			participants.put(participant.getName(), participant);
		}
		participant.setChatroom(this);
	}

	@Override
	public void send(String from, String to, String message) {
		Participant participant = participants.get(to);
		if (participant != null) {
			participant.receive(from, message);
		}
	}
}