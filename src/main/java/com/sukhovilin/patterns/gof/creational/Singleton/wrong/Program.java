package com.sukhovilin.patterns.gof.creational.Singleton.wrong;

public class Program {

	public static void main(String[] args) {
		MySingleton instance = MySingleton.getInstance();
		instance.work();
		instance.work();
	}

}
