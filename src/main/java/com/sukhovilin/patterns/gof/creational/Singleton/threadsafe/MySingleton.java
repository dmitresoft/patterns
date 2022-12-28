package com.sukhovilin.patterns.gof.creational.Singleton.threadsafe;

public class MySingleton {
	private static MySingleton instance;

	private MySingleton() {
	}

	public static synchronized MySingleton getInstance() {
		if (instance == null) {
			instance = new MySingleton();
		}
		return instance;
	}

	public void work() {
		System.out.println("it works, thread safe " + this);
	}
}