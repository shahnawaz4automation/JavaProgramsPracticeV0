package java_programs_practice_072024;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomData {
	
	//Using Apache commons-lang API
	public static void main(String[] args) {
		int a = Integer.parseInt(RandomStringUtils.randomNumeric(5));
		String s = RandomStringUtils.randomAlphabetic(5);
		
		System.out.println(a);
		System.out.println(s);
	}
}
