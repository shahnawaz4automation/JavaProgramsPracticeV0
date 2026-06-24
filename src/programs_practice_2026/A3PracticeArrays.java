package programs_practice_2026;

public class A3PracticeArrays {
	public static void main(String[] args) {
		String[] users = {"admin", "tester", "manager"};
		
		String[] users1 = new String[3];
		users1[0] = "a";
		users1[1] = "b";
		users1[1] = "c";
		users1[2] = "d";
		//users1[3] = "e";
		System.out.println(users1[2]);
		System.out.println("Array lenghth is: " + users1.length);
		
		for(int i = 0; i<users1.length; i++) {
			System.out.println(users1[i]);
		}
		
		for(String user2: users1) {
			System.out.println(user2);
		}
		
		String cities[] = {"Hyderabad", "Mumbai", "Delhi", "Chennai", "Bangalore"};
		for (int j = 0; j < cities.length; j++) {
			System.out.println("String at "+ j + " position is: " +cities[j]);
		}
		
		System.out.println("Number of strings in array is: " + cities.length);
	}
}
