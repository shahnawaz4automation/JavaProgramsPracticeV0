package programs_practice_062024;

public class EvenOddFromArray15 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		
		System.out.println("Odd Numbers in an array are:");
		for (int i = 0; i<a.length; i ++) {
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
		
		System.out.println("Even Numbers in an array are:");
		for (int i = 0; i<a.length; i ++) {
			if(a[i]%2==0)
				System.out.println(a[i]);
		}

	}
}
