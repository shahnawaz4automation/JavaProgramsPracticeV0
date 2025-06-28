package programs_practice_062024;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		HashSet hs1 = new HashSet();
		hs.add(100);
		hs.add("welcome");
		hs.add(16.4);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);
		
		hs.remove(16.4);
		System.out.println(hs);
		
		System.out.println(hs.contains(100));
		
		System.out.println(hs.isEmpty());
		System.err.println(hs1.isEmpty());
		hs1.addAll(hs);
		System.out.println(hs1);
		hs1.removeAll(hs);
		System.out.println(hs1);
	}

}
