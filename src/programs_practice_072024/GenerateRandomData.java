package programs_practice_072024;

import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomData {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("Number is prime");
			}
			else
			{
				System.out.println("Number is not prime");
			}
		}else {
			System.out.println("Number is not prime");
		}
		
	}
	
	
	
	//Using Apache commons-lang API
	public static void main1(String[] args) {
		int a = Integer.parseInt(RandomStringUtils.randomNumeric(5));
		String s = RandomStringUtils.randomAlphabetic(5);
		
		System.out.println(a);
		System.out.println(s);
	}
}
