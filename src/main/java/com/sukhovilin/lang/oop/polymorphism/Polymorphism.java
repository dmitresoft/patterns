package com.sukhovilin.lang.oop.polymorphism;

public class Polymorphism {

	public static void main(String[] args) {

		showName(new Student());
		showName(new Professor());

	}

	private static void showName(Person person) {

		System.out.println("Who are you? " + person.getName());

	}

}
