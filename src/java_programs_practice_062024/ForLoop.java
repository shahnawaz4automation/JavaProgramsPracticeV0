package java_programs_practice_062024;

public class ForLoop {
	public static void main(String[] args) {
		int[] a = new int[8];
		a[0] = 1;
		a[2] = 2;
		a[3] = 3;
		//a[4] = 4;
		a[5] = 5;
		//a[6] = 6;
		a[7] =7;
		
		System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int a1:a) {
			System.out.println(a1);
			
		}
		// comment
		

	}
}
