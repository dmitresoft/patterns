package com.sukhovilin.patterns.gof.behavioral.ChainOfResponsibility.samaple;

public class WarnLogger extends Logger {

	@Override
	public String log(LogLevel level) {
		if (LogLevel.WARN == level)
			return "WARN";
		return new ErrorLogger().log(level);
	}

}	
