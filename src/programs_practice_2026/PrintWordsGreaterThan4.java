package programs_practice_2026;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsGreaterThan4 {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Rahul");
		names.add("Amit");
		names.add("John");
		names.add("Sara");
		names.add("Shahnawaz");
		for (String name : names) {
			if (name.length() > 4) {
				System.out.println(name);
			}
		}
	}
}
