package java_programs_practice_102024;

import java.util.ArrayList;

public class ArralistTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add('a');
		
		char b = (char) list.get(0);
		System.out.println(b);
	}
}
