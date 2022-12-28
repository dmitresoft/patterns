package com.sukhovilin.patterns.gof.behavioral.ChainOfResponsibility.samaple;

public class InfoLogger extends Logger {

	@Override
	public String log(LogLevel level) {

		if (level == LogLevel.INFO) {
			return "INFO";
		}

		return new WarnLogger().log(level);
	}

}
