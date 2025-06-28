package programs_practice_102024;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomDataGeneration {

	public static void main(String[] args) {
		String n = RandomStringUtils.randomNumeric(3);
		int num = Integer.parseInt(n);
		System.out.println(num);
		
		System.out.println(RandomStringUtils.randomAlphabetic(3));
	}

}
