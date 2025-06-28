package programs_practice_112024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

public class CollectionsTesT {
	public static void main(String[] args) {
		HashSet s = new HashSet();
		s.add("sam");
		s.add("sam");
		System.out.println(s);

		Hashtable ht = new Hashtable();
		ht.put(1, "sam");
		ht.put(1, "sam1");
		ht.put(1, "sam2");
		ht.put(1, "sam3");
		// ht.put(1, "sam4");
		System.out.println(ht);

		List list = new ArrayList();
		list.add("sam");
		list.add("sam");
		System.out.println(list);
		
	}
}
