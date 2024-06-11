package java_programs_practice_062024;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		String num = RandomStringUtils.randomNumeric(5);
		int i = Integer.parseInt(num);
		System.out.println(i);
		
		System.out.println(RandomStringUtils.randomAlphanumeric(5));
	}

}
