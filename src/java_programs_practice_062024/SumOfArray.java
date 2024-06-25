package java_programs_practice_062024;

public class SumOfArray {
	static int sum = 0;
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4};
		
		for (int i = 0; i < a.length; i++) {
			int num = 10;
			sum = sum + a[i];
			System.out.println(num);
		}
		System.out.println(sum);
		//System.out.println(num);
	}
}
