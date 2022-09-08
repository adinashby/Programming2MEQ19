package myhelpers;

public class Square extends Shape implements Printable, Doable {
	
	static int currentShapeNum = 0;
	
	public Square() {
		++currentShapeNum;
	}
	
	@Override
	public double calcArea() {
		return width * 4;
	}

	@Override
	public void printSomething() {
		System.out.println("In Square");
		System.out.println("The limit is: " + numberOfShapes);
		doSomething();
		
	}

	@Override
	public void doable() {
		System.out.println("Do something");
		
	}

}
