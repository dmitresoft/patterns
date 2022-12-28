package com.sukhovilin.patterns.gof.creational.Singleton.doublechecked;

public class SingletonWithLocalInstance {

	public static void main(String[] args) {

		SingletonWithLocalInstance i = SingletonWithLocalInstance.get();
		String status = i.getStatus();
		System.out.println(status);

	}

	private static volatile SingletonWithLocalInstance instance;

	public static final SingletonWithLocalInstance get() {

		SingletonWithLocalInstance localInstance = instance;
		if (localInstance == null) {
			synchronized (SingletonWithLocalInstance.class) {
				if (localInstance == null) {
					instance = localInstance = new SingletonWithLocalInstance();
				}
			}
		}
		return instance;
	}

	public String getStatus() {
		return "correct";
	}

}
