package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Zero");
		al.add("One");
		al.add("Three");
		al.add("Four");

		// Size of array
		System.out.println("Number of element/s in ArrayList: " + al.size());

		// Insert an element at 2nd index
		al.add(2, "Two");
		System.out.println("After adding the element at 2nd index: " + al);

		// Remove element at 4th index
		al.remove(4);
		System.out.println("After removing the element form 4th index in ArrayList: " + al);

		// Retrieve specific element
		System.out.println("Element at 1st index is: " + al.get(1));

		// Replacing the value at 1st index
		al.set(1, "ONE");
		System.out.println("After replacing the value at 1st index: " + al);

		// search - contains()
		System.out.println(al.contains("Five"));
		System.out.println(al.contains("ONE"));

		System.out.println(al.isEmpty());

		// print all the elements using for loop
		int arraySize = al.size();
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Element at " + i + "th index is: " + al.get(i));
		}

		// print all the elements using enhanced for loop
		for (String a : al) {
			System.out.println(a);
		}

		// print all the elements using iterator()
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);

		// Removing 'Zero' in the Array
		Iterator<String> it1 = al.iterator();
		while (it1.hasNext()) {
			String s = it1.next();
			if (s.equals("Zero")) {
				it1.remove();
			}
		}
		System.out.println(it1);
	}
}
