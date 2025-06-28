package programs_practice_072024;

public class PrimeOrNo {

	public static void main(String[] args) {
		int num = 8;
		int count = 0;
		
		if(num>1) {
			for(int i = 1; i <= num; i++) {
				if(num%i==0)  //8/1=0, 8/2=4, 8/3=
					count++;
				
			}
			if(count==2) {
				System.out.println("Prime number");
			}
			else {
				System.out.println("Not prime number");
			}
		}else {
			System.out.println("Not Prime Number");
		}
	}

}
