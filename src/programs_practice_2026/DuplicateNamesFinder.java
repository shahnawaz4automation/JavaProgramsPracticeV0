package programs_practice_2026;

import java.util.Arrays;
import java.util.List;

public class DuplicateNamesFinder {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Rahul", "Amit", "Rahul", "John", "Amit", "Sara");
		int count = 0;

		for (String name : list) {
			if (name.equals("Rahul")) 
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
