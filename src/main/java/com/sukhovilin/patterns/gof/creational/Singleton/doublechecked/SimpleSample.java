package com.sukhovilin.patterns.gof.creational.Singleton.doublechecked;

public class SimpleSample {

	public static void main(String[] args) {
		MySingleton instance = MySingleton.getInstance();
		instance.work();
		instance.work();
	}

}

class MySingleton {
	private static volatile MySingleton instance;

	// Double-checked locking -- don't use without volatile
	public static MySingleton getInstance() {
		if (instance == null) {
			synchronized (MySingleton.class) {
				if (instance == null) {
					instance = new MySingleton();
				}
			}
		}
		return instance;
	}

	public void work() {
		System.out.println("it works, thread do not safe");
	}
}