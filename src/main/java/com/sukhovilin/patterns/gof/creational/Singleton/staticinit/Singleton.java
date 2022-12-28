package com.sukhovilin.patterns.gof.creational.Singleton.staticinit;

public class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}

	public void work() {
		System.out.println("it works!");
	}
}
