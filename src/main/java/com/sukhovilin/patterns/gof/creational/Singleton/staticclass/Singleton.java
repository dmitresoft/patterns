package com.sukhovilin.patterns.gof.creational.Singleton.staticclass;

public class Singleton {

	public Singleton() {
		System.out.println("ctor()");
	}

	public static final Singleton getInstance() {
		System.out.println("getting instance");
		return SingletonHolder.instance;
	}

	private static class SingletonHolder {
		public static final Singleton instance = new Singleton();
	}

	public void test() {
		System.out.println("test()");

	}

}
