package com.sukhovilin.tasks.my_linkedlist;

public class ListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(new ListItem(11));
        list.add(new ListItem(23));
        list.add(new ListItem(35));

        list.display();
    }


    static class LinkedList {

        private ListItem first;
        private ListItem last;

        public void add(ListItem item) {
            if (first == null)
                first = item;
            else
                last.next = item;

            last = item;
        }

        public void display() {
            ListItem current = first;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }

    }

    static class ListItem {
        public final int data;
        public ListItem next;

        public ListItem(int data) {
            this.data = data;
        }
    }

}