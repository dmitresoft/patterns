package com.sukhovilin.lang.iterators;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UsageTest {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		display(list);

	}

	public static void display(Iterable<String> list) {
		for (Iterator<String> it = list.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
	}

}
