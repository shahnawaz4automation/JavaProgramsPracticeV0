package programs_practice_ABC062025;

public class CountOfNumberOfDigits {
	/*public static void main(String[] args) {
		int number = 1234;

		int count = 0;

		while (number > 0) {
			number = number / 10;
			count++;
		}
		System.out.println(count);
	}*/
	
	public static void main(String[] args) {
		int num = 100101010;
		int count = 0;
		
		while(num>0) {
			num = num/10;
			count++;
		}
		
		System.out.println(count);
	}
}
