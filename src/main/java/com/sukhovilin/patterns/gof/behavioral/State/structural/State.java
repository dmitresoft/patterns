package com.sukhovilin.patterns.gof.behavioral.State.structural;

/**
 * The 'State' abstract class
 */
abstract class State {
	public abstract void handle(Context context);
}