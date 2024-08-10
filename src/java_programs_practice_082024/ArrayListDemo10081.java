package java_programs_practice_082024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo10081 {
	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(1);
		al.add(3);
		al.add(4);
		al.add(2);
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
	}
}
