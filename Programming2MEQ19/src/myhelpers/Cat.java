package myhelpers;

public class Cat extends Mammal {
	
	protected int age;
	
	public Cat() {
		this.age = 5;
	}
	
	public Cat(String name, String gender, String furType, int age) {
		super(name, gender, furType);
		this.age = age;
	}
	
	@Override
	public void makeASound() {
		System.out.println("Meow");
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void pur() {
		System.out.println("Purrr");
	}
	
//	public void test() {
//		Animal myAnimal = new Animal();
//		
//		myAnimal.name = "Y";
//		
//	}

}
