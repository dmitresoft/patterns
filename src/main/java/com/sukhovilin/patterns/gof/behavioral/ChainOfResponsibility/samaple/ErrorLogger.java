package com.sukhovilin.patterns.gof.behavioral.ChainOfResponsibility.samaple;

public class ErrorLogger extends Logger{

	@Override
	public String log(LogLevel level) {
		return "ERROR";
	}

}
