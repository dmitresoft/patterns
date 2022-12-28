package com.sukhovilin.patterns.gof.behavioral.Mediator.structural;

/**
 * The 'Mediator' abstract class
 */
abstract class Mediator {
	public abstract void send(String message, Colleague colleague);
}