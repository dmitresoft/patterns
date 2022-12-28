package com.sukhovilin.patterns.gof.creational.Singleton.wrong;

/**
 * Two Singletons will be created if the constructor runs and simultaneously
 * another thread calls the method. Thread-safe code is particularly important
 * in Singletons, since that Design Pattern is meant to give the user a single
 * point of access that hides the complexities of the implementation, including
 * multithreading issues. Multiple instances can be created even if you add a
 * synchronized(this) block to the constructor call, as in Listing:
 */
public class MySingleton {
	private static MySingleton instance;

	// An error, synchronization does not prevent
	// two calls of constructor.
	public static MySingleton getInstance() {
		if (instance == null) {
			synchronized (MySingleton.class) {
				instance = new MySingleton();
			}
		}
		return instance;
	}
	
	public void work() {
		System.out.println("it works, thread do not safe");
	}
}