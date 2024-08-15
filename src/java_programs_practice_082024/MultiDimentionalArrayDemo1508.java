package java_programs_practice_082024;

public class MultiDimentionalArrayDemo1508 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 4, 5, 6, 7 } };
		
		int sum_num = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum_num = sum_num + a[i][j];
			}
		}
		System.out.println(sum_num);
	}
}
