package com.sukhovilin.patterns.gof.structural.Bridge.realworld;

import java.util.LinkedList;
import java.util.List;

/**
 * The 'ConcreteImplementor' class
 */
class CustomersData extends DataObject {
	private List<String> customers = new LinkedList<String>();
	private int current = 0;

	public CustomersData() {
		// Loaded from a database
		customers.add("Jim Jones");
		customers.add("Samual Jackson");
		customers.add("Allen Good");
		customers.add("Ann Stills");
		customers.add("Lisa Giolani");
	}

	@Override
	public void nextRecord() {
		if (current <= customers.size() - 1) {
			current++;
		}
	}

	@Override
	public void priorRecord() {
		if (current > 0) {
			current--;
		}
	}

	@Override
	public void addRecord(String customer) {
		customers.add(customer);
	}

	@Override
	public void deleteRecord(String customer) {
		customers.remove(customer);
	}

	@Override
	public void showRecord() {
		System.out.println(customers.get(current));
	}

	@Override
	public void showAllRecords() {
		for (String customer : customers) {
			System.out.println(" " + customer);
		}
	}
}