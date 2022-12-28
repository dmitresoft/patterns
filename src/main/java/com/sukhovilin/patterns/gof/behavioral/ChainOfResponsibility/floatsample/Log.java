package com.sukhovilin.patterns.gof.behavioral.ChainOfResponsibility.floatsample;

public interface Log {

	public enum Level {
		WARN, ERRROR, INFO
	}

	String log(Level level, String message);

	void next(Log info);

}
