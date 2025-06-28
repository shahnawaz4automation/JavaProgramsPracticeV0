package programs_practice_072024;

public class assignmentOperator {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		
		//System.out.println(a=b);
		//System.out.println(a+=b);
		//System.out.println(a-=b);
		//System.out.println(a*=b);
		System.out.println(a%=b);
		
		String s1 = "a";
		String s2 = "b";
		
		if(s1.contains(s2)||s2.contains(s1)) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
	}
}
