package java_programs_practice_062024;

public class Main1 {
	 public static void main(String[] args) {
	     Animal myDog = new Dog();
	     myDog.makeSound(); // Output: Bark

	     // Using encapsulation
	     Dog realDog = (Dog) myDog;
	     realDog.setName("Buddy");
	     System.out.println(realDog.getName()); // Output: Buddy
	 }
	}