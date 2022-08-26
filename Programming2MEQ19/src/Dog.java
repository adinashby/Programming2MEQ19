
public class Dog extends Mammal {
	private String breed;
	
	public Dog() {
//		super("Goldy", "Male");
//		this.breed = "golden retriever";
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void bark() {
		System.out.println("Woof woof");
	}
}
