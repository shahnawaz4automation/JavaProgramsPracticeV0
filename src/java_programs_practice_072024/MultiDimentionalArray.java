package java_programs_practice_072024;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10, 11, 12, 13 }, {1,2,3}};

		System.out.println(a.length);

		System.out.println(a[0].length);
		System.out.println(a[1].length);
		System.out.println(a[2].length);

		for (int i = 0; i < a.length; i++) {
			System.out.print("[");
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
				continue;
			}
			System.out.print("]");
			System.out.println();
		}
	}

}
