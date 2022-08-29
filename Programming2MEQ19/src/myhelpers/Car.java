package myhelpers;

public class Car {
	private String color;
	private String model;
	private static int numberOfCars = 0;
	
	public Car() {
		this.color = "Black";
		this.model = "Toyota";
		++numberOfCars;
	}
	
	public Car(String color, String model) {
		this.color = color;
		this.model = model;
		++numberOfCars;
	}
	
	public Car(Car car) {
		this.color = car.color;
		this.model = car.model;
		++numberOfCars;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String toString() {
		return "Color: " + this.color 
				+ "\nModel: " + this.model;
	}
	
	public boolean equals(Car anotherCar) {
		if(this.color.equalsIgnoreCase(anotherCar.getColor())
				&& this.model.equalsIgnoreCase(anotherCar.getModel())) {
			return true;
		}
		
		return false;
	}
	
	public static int getNumberOfCars() {
		return numberOfCars;
	}
	
}
