package java_programs_practice_052024;

public class CarDemo {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.iMethod("Maruti", "SwiftVDI", "Red", 800000, 24.12);
		
		car1.startCar();
		car1.carDetails();
		car1.stopCar();
	}

}
