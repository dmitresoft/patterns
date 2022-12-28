package com.sukhovilin.patterns.gof.creational.Singleton.staticinit;

public class Program {

	public static void main(String... args) {
		Singleton singleton = Singleton.getInstance();
		singleton.work();
	}

}
