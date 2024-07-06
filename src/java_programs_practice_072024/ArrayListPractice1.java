package java_programs_practice_072024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPractice1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println(al.remove(2));
		System.out.println(al);
		
		al.add(2, "15.5");
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		al.set(2, "20.5");
		System.out.println(al);
		
		System.out.println(al.contains("welcome"));
		
		System.out.println(al.isEmpty());
		
		System.out.println("----------------------for loop----------------------");
		//for loop
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("----------------------for each loop----------------------");
		//for each/enhanced for loop
		for (Object o: al) {
			System.out.println(o);
		}
		System.out.println("----------------------Iterator----------------------");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArrayList al1 = new ArrayList();
		al1.addAll(al);
		System.out.println(al1);
		
		al1.removeAll(al);
		System.out.println(al1);
		
		ArrayList al2 = new ArrayList();
		al2.add("1");
		al2.add("3");
		al2.add("A");
		al2.add("F");
		al2.add("M");
		Collections.sort(al2);
		System.out.println(al2);
		
		Collections.reverse(al2);
		System.out.println(al2);
		
		Collections.shuffle(al2);
		System.out.println(al2);
		
		al2.clear();
		System.out.println(al2);
	}

}
