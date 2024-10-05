package java_programs_practice_102024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArralistTest {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("welcome");
		al.add(15.5);
		al.add('a');
		al.add(100);
		
		Set s = new HashSet();
		s.addAll(al);
		System.out.println(s);
		
	}
}
