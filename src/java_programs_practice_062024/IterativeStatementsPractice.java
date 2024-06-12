package java_programs_practice_062024;

import java.util.ArrayList;

public class IterativeStatementsPractice {
	public static int addNumbers() {
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
	public static void addNumbers1() {
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println(c);
		addNumbers();
	} 
	public static void main(String[] args) {
		int c1 = addNumbers();
		System.out.println(c1);
		int i = 0;
		do {
			System.out.println(i);
			i++;
		}while(i<3);
		
		ArrayList al = new ArrayList();
		al.add("100");
		al.add("200");
		al.add("300");
		
		for(Object o:al) {
			System.out.println(o);
		}
		System.out.println("---------------------------------------------------");
		for(int i1 = 0; i1<al.size();i1++) {
			System.out.println(al.get(i1));
			continue;
		}
		
		//Iterator itr = al.iterator();
		/*
		 * while(itr.hasNext()) { System.out.println(itr.next()); }
		 */
		
		/*
		 * do { //System.out.println("Starting printing the array objects");
		 * System.out.println(itr.next()); System.out.println("1");
		 * }while(itr.hasNext()); System.out.println("End of do while loop");
		 */
	}
	
	
}
