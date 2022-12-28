package com.sukhovilin.algorithms.lists.linkedlist;

public class Sample {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.add(new ListItem(11));
		list.add(new ListItem(23));
		list.add(new ListItem(35));

		list.display();
	}
}

class LinkedList {

	private ListItem first;

	public void add(ListItem item) {
		item.next = first;
		first = item;
	}

	public void display() {
		ListItem current = first;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

}

class ListItem {
	public final int data;
	public ListItem next;

	public ListItem(int data) {
		this.data = data;
	}

}