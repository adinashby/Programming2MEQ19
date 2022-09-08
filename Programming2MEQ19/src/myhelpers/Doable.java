package myhelpers;

public interface Doable {
	final static int numberOfShapes = 10;
	
	public void doable();
	
	public default void doSomething() {
		System.out.println("I'm doing something");
	}
}
