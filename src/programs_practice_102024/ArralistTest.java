package programs_practice_102024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArralistTest {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("a");
		al.add("w");
		al.add("b");
		al.add("c");
		al.add("g");
		
		/*//1. Using for loop
		for(int i = 0; i<al.size(); i++) {
			//System.out.println(al.get(i));
		}
		
		//2. Using iterator()
		Iterator it = al.iterator();
		while (it.hasNext()) {
			//System.out.println(it.next());
		}*/
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
	}
}
