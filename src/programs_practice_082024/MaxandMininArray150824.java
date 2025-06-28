package programs_practice_082024;

public class MaxandMininArray150824 {
	public static void main(String[] args) {
		int[] a = {3,4,5,6,2,3};
		int number = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>number) {
				number = a[i];
			}
		}
		System.out.println("Maximum number is: " + number);
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<number) {
				number = a[i];
			}
		}
		System.out.println("Minimum number is: " + number);
	}
}
