package java_programs_practice_062024;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo1 {

	@SuppressWarnings({ "unchecked", "unchecked" })
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println(al.get(0));
		
		System.out.println(al.remove(0));
		System.out.println(al.size());
		
		al.add(1,"welcome to java");
		System.out.println(al);
		
		System.out.println(al.contains("welcome"));
		
		System.out.println(al.isEmpty());
		
		//for loop to print all the elements in an array
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("---------------------------------------");
		
		//iterator() to print all the elements in an array
		Iterator itr =  al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------------------------------");
		
		//for each loop to print all the elements in an array
		for(Object obj:al) {
			System.out.println(obj);
		}
		System.out.println("---------------------------------------");
		ArrayList al_dup = new ArrayList();
		al_dup.addAll(al);
		System.out.println("al_dup size after adding from al: "+al_dup.size());
		System.out.println("---------------------------------------");
		al_dup.removeAll(al);
		System.out.println("al_dup size after removing from al: "+al_dup.size());
		System.out.println("---------------------------------------");
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("100");
		al1.add("welcome");
		al1.add("15.5");
		al1.add("A");
		al1.add("true");
		
		Collections.sort(al1);
		System.out.println(al1);
		
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println(al1);
		
		Collections.shuffle(al1);
		System.out.println(al1);
		


	}

}
