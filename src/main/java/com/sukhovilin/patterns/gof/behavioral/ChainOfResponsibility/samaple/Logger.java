package com.sukhovilin.patterns.gof.behavioral.ChainOfResponsibility.samaple;

public abstract class Logger {

	public static enum LogLevel {
		INFO, WARN, ERROR
	}

	public abstract String log(LogLevel level);
	
}
