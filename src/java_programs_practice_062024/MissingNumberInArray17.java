package java_programs_practice_062024;

public class MissingNumberInArray17 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5 };
		
		//Array - should not have duplicate
		//Array - no need to be in sorted order
		//Values should be in range
		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("Sum of elements in the array: " + sum1);

		int sum2 = 0;
		for (int j = 1; j <= 5; j++) {
			sum2 = sum2 + j;
		}
		System.out.println("Sum of range of elements in array: " + sum2);
		
		System.out.println("Missing number in array is: "+(sum2-sum1));
	}

}
