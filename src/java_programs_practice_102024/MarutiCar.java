package java_programs_practice_102024;

public class MarutiCar implements Car {

	@Override
	public void transmissionMode() {
		System.out.println("By Default manual transmission");
	}

	public void customTransmissionMode() {
		System.out.println("You can also get automatic transmission");
	}

	public static void main(String[] args) {
		Car car = new MarutiCar();
		car.transmissionMode();
		car.customTransmissionMode();
		System.out.println(Car.wheels);
	}
}
