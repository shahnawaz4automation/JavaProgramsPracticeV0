package java_programs_practice_082024;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1008 {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add('a');
		al.add("Sam");
		al.add(1);
		al.add(null);

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
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
	}

}
