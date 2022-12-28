package com.sukhovilin.lang.tasks.task08;

public class Main {
	static void method(int... a) {
		System.out.println("inside int...");
	}

	static void method(long a, long b) {
		System.out.println("inside long");
	}

	static void method(Integer a, Integer b) {
		System.out.println("inside INTEGER");
	}

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		method(a, b);
	}
}
