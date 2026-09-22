package collections;

import java.util.LinkedList;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(100);
		list.add("welcome");
		list.add(15.5);
		list.add('A');
		list.add(true);
		list.add(null);

		System.out.println(list);

		System.out.println(list.size());

		// remove
		list.remove(3);
		System.out.println("After removing, new list: " + list);

		// Insert add element in the middle of linked list
		list.add(3, "Java");
		System.out.println("After adding an element in the middle, new list: " + list);
	}
}
