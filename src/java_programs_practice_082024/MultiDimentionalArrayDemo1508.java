package java_programs_practice_082024;

public class MultiDimentionalArrayDemo1508 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 4, 5, 6, 7 } };
		for (int i = 0; i < a.length; i++) {
			System.out.print("[");
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.print("]");
			System.out.println();
		}
	}
}
