package com.sukhovilin.patterns.interprise.repository;

public class Program {
	public static void main(String[] args) {

		Repository<Integer, String> persons = new PersonRepository();
		System.out.println("count before: " + persons.count());
		final int i1 = persons.save("John Smith");
		final int i2 = persons.save("Bill Black");
		System.out.println("count after: " + persons.count());
		System.out.println("listing...");
		for (String person : persons.list()) {
			System.out.println(" - " + person);
		}
		System.out.println("looking");
		System.out.println(persons.load(i1));
		System.out.println(persons.load(i2));
		System.out.println("deleting id:" + i1);
		persons.delete(i1);
		System.out.println("listing...");
		for (String person : persons.list()) {
			System.out.println(" - " + person);
		}
		System.out.println("count: " + persons.count());

	}
}