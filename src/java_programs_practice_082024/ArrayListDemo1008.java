package java_programs_practice_082024;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo1008 {

	public static void main(String[] args) {
		List<Object> al = new LinkedList<Object>();
		al.add('a');
		al.add("Sam");
		al.add(1);
		al.add(null);
		al.add(1);
		
		al.addFirst("1st");
		al.addLast("Last");
		System.out.println(al);
		System.out.println(al.getFirst()+" is Mohammed Shahnawaz");
		System.out.println(al.getLast());
		al.removeFirst();
		al.removeLast();
		System.out.println(al);
		
		// 1. Using for each loop
		for (Object o : al) {
			System.out.print(o + "\t");
		}
		System.out.println();
		// 2. for loop
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + "\t");
		}
		System.out.println();
		//Using iterator()
		Iterator it = al.iterator();
	}

}
