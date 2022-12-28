package com.sukhovilin.patterns.gof.behavioral.ChainOfResponsibility.floatsample;

public class ErrorLog implements Log {

	@Override
	public String log(Level level, String message) {
		return "error: " + message;
	}

	@Override
	public void next(Log info) {

	}

}
