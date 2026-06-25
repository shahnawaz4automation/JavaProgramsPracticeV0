package programs_practice_122024;

public class Dog extends Animal{
	void sound() {
		System.out.println("Barking");
	}
	
	
	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
	}
}
