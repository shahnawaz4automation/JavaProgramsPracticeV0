package java_programs_practice_062024;

public class SumOfElementsInArray {
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int sum = 0, num = 0;
		
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		
		System.out.println("Sum of elements in an array is: "+ sum);
		
		//for each loop/enhanced for loop
		for(int i:a) {
			num = num+i;
		}
		System.out.println(num);
	}

}
