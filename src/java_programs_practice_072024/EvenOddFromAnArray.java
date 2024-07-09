package java_programs_practice_072024;

public class EvenOddFromAnArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		
		for(int value: a) {
			if(value%2==0) {
				System.out.println("Even number: "+value);
			}
			else {
				System.out.println("Odd number: "+value);
			}
		}
	}
}
