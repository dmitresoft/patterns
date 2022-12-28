package com.sukhovilin.lang.oop.inheritance;

public class Manager extends Student {

	public void sayHello() {
		super.sayHi();
		System.out.println("manager says: hello");
	}

}
