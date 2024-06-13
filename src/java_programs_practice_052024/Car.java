package java_programs_practice_052024;

public class Car {
	String company;
	String model;
	String color;
	double cost;
	double mileage;
	static int wheels = 4;
	
	public void iMethod(String company,
	String model,
	String color,
	double cost,
	double mileage) {
		this.company = model;
		this.model = model;
		this.color = color;
		this.cost = cost;
		this.mileage = mileage;
	}
	
	public void startCar() {
		System.out.println("Car from company "+company+" having model "+ model+ " has started.");
	}
	
	public void stopCar() {
		System.out.println("Car from company "+company+" having model "+ model+ " has stopped.");
	}
	
	public void carDetails() {
		System.out.println("Company of car is: "+company);
		System.out.println("model of car is: "+model);
		System.out.println("color of car is: "+color);
		System.out.println("cost of car is: "+cost);
		System.out.println("mileage of car is: "+mileage);
		System.out.println("wheels of car is: "+wheels);
		
	}
}
