package com.sukhovilin.lang.tasks.task05.testPackage;

class Test {

	public static void main(String[] args) {

		String hello = "Hello";
		String lo = "lo";

		System.out.print((com.sukhovilin.lang.tasks.task05.testPackage.Other.hello == hello) + " ");
		System.out.print((com.sukhovilin.lang.tasks.task05.other.Other.hello == hello) + " ");
		System.out.print((hello == ("Hel" + "lo")) + " ");
		System.out.print((hello == ("Hel" + lo)) + " "); // runtime
		System.out.println(hello == ("Hel" + lo).intern());

	}

}

class Other {
	static String hello = "Hello";
}