
public class MyTests6 {

	public static void main(String[] args) {
		Cat myCat = new Cat();
		
		System.out.println(myCat.getAge());
		
		myCat.setName("Fluffy");
		System.out.println(myCat.getName());
		
		Dog myDog = new Dog();
		
		myDog.bark();
		myDog.setName("Q");
		System.out.println(myDog.getName());
		
		System.out.println();
		
		Cat mySecondCat = new Cat("G", "Female", "soft", 2);
		
		System.out.println(mySecondCat.getGender());
	}
}
