package java_programs_practice_082024;

import java.util.Arrays;

public class CountWordsOccurence {
	public static void main(String[] args) {
		
		String input = "This is a sample to sentence to count words.";
		int count = 0;
		String[] arr = input.trim().split("\\s");
		System.out.println("Count of total words is: "+ arr.length);
		//String[] arr1 = input.trim().split("\\s");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equalsIgnoreCase("count")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
