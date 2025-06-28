package programs_practice_072024;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomDataDemo2407 {
	public static void main(String[] args) {
		
		String randomString = RandomStringUtils.randomAlphabetic(5);
		System.out.println(randomString);
		
		String randomInt= RandomStringUtils.randomNumeric(5);
		int randomInt1 = Integer.parseInt(randomInt);
		System.out.println(randomInt1);
	}
}
