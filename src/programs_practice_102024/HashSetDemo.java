package programs_practice_102024;

import java.util.HashSet;
import java.util.Hashtable;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet s = new HashSet();
		s.add("sam");
		s.add(null);
		
		System.out.println("sam");
		
		Hashtable ht = new Hashtable();
		ht.put(1, "sam");
		ht.put(1, "sam1");
		ht.put(1, "sam2");
		ht.put(1, "sam3");
		//ht.put(1, "sam4");
		
		System.out.println(ht);
	}
}
