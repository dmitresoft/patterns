package com.sukhovilin.patterns.gof.creational.Singleton.staticclass;

public class Program {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		instance.test();
		Singleton instance1 = Singleton.getInstance();
		instance1.test();
	}
}
