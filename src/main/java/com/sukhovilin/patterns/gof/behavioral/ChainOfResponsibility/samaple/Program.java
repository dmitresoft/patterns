package com.sukhovilin.patterns.gof.behavioral.ChainOfResponsibility.samaple;

import com.sukhovilin.patterns.gof.behavioral.ChainOfResponsibility.samaple.Logger.LogLevel;

public class Program {

	public static void main(String[] args) {
		String a = new InfoLogger().log(LogLevel.WARN);
		System.out.println(a);
	}
}
