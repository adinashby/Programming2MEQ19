
public class Cat extends Mammal {
	
	private int age;
	
	public Cat() {
		this.age = 5;
	}
	
	public Cat(String name, String gender, String furType, int age) {
		super(name, gender, furType);
		this.age = age;
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

}
