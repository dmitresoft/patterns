package com.sukhovilin.patterns.gof.behavioral.ChainOfResponsibility.floatsample;


public class InfoLog implements Log{

	private Log next;
	
	@Override
	public String log(Level level,String message) {
		
		if (level == Log.Level.INFO) {
			return "info: " + message;
		}

		return next.log(level, message);
		
	}

	@Override
	public void next(Log next) {
		this.next = next;
	}

}
