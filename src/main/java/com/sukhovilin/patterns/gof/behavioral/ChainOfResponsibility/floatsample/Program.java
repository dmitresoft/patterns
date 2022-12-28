package com.sukhovilin.patterns.gof.behavioral.ChainOfResponsibility.floatsample;

public class Program {

	public static void main(String[] args) {

		Log info = new InfoLog();
		Log warn = new WarnLog();
		Log error = new ErrorLog();

		info.next(warn);
		warn.next(error);

		new Program().run(info);

	}

	private void run(Log info) {

		System.out.println(info.log(Log.Level.INFO, "information"));
		System.out.println(info.log(Log.Level.WARN, "warning"));
		System.out.println(info.log(Log.Level.ERRROR, "error"));

	}

}
