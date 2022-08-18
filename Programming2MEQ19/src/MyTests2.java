
public class MyTests2 {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println(Car.getNumberOfCars());
		
		Car myOtherCar = new Car("Green", "BMW");
		
		System.out.println(Car.getNumberOfCars());
		
		System.out.println(myCar);
		
		System.out.println(myCar.equals(myOtherCar));

	}

}
