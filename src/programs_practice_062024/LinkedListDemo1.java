package programs_practice_062024;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		//Declare Linked list
		//LinkedList<String> l = new LinkedList<String>();
		//LinkedList<Integer> l = new LinkedList<Integer>();

		LinkedList l = new LinkedList();
		
		//Add elements into the linkedlist
		l.add(100);
		l.add("welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);
		
		
		System.out.println(l); //[100, welcome, 15.5, A, true, null]
		
		System.out.println(l.size()); //6
		
		//remove
		l.remove(3); //index
		System.out.println(l); //[100, welcome, 15.5, true, null]
		
		//Insert/adding element in the middle of the linked list
		l.add(3,'B');
		System.out.println(l);//[100, welcome, 15.5, B, true, null]
		
		//retriving value/object
		System.out.println(l.get(3));//B
		
		//change the value
		l.set(5, 'X');
		System.out.println("After changing the value: "+l);//After changing the value: [100, welcome, 15.5, B, true, X]

		//contains
		System.out.println(l.contains("welcome"));//true
		System.out.println(l.contains("N"));//false
		
		//isEmpty()
		System.out.println(l.isEmpty());
		
		//Reading elements from LinkedList using for loop
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("=for loop usage=");
		
		//iterator() method
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("=iterator() usage=");
		
		LinkedList l1 = new LinkedList();
		l1.addAll(l);
		System.out.println(l1); //[100, welcome, 15.5, B, true, X]
		
		l1.removeAll(l);
		System.out.println(l1); //[]
	}
}
