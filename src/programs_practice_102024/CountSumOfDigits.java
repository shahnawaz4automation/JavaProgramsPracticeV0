package programs_practice_102024;

public class CountSumOfDigits {
	public static void main(String[] args) {
		int num = 1111111111;
		int sum = 0;
		
		while (num>0) {
			int last_number = num%10;
			sum = sum+last_number;
			num = num/10;
		}
		
		System.out.println(sum);
	}
}
