package com.sukhovilin.patterns.gof.behavioral.Visitor.fruits;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * This application calculates a price and a tax of list of the fruit.
 * 
 * @author Dmitry Sukhovilin
 */
class Program {

	public static void main(String[] args) {
		new Program().run();
	}

	private void run() {

		List<Object> fruits = new LinkedList<Object>();
		fruits.add(new Apple());
		fruits.add(new Orange());
		fruits.add(new Lemon());

		doPrice(fruits, new PriceVisitorImpl());
		doTax(fruits.listIterator(), new TaxVisitorImpl());

	}

	void doPrice(List<?> list, PriceVisitor visitor) {
		Iterator<?> iterator = list.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			if (next instanceof PriceVisitable) {
				((PriceVisitable) next).accept(visitor);
			}
		}
		String out = String.format("Price=\t%f", visitor.getTotalPrice());
		System.out.println(out);
	}

	void doTax(Iterator<?> iterator, TaxVisitor visitor) {
		while (iterator.hasNext()) {
			Object next = iterator.next();
			if (next instanceof TaxVisitable) {
				((TaxVisitable) next).accept(visitor);
			}
		}
		String out = String.format("Tax=\t%f", visitor.getTotalTax());
		System.out.println(out);
	}

}
