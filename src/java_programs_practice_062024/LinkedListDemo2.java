package java_programs_practice_062024;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();

		// Add elements into the linkedlist
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		System.out.println(l);//[X, Y, Z, A, B, C]
		
		//sort() 
		Collections.sort(l);
		System.out.println(l); //[A, B, C, X, Y, Z]
		
		//reverse order
		Collections.reverse(l);
		System.out.println(l);//[Z, Y, X, C, B, A]
		
		//shuffle
		Collections.shuffle(l);
		System.out.println(l); //[A, C, Z, B, Y, X]
	}
}
