package java_programs_practice_072024;

public class OneDimentionalArray {

	public static void main(String[] args) {
		int[] a = new int[3];

		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		//System.out.println(a[0]);

		int[] b = { 1, 2, 3 };
		b[0] = 1;
		//System.out.println(b[0]);

		int l = b.length;

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		for (int i:b) {
			System.out.println(i);
		}

	}

}
