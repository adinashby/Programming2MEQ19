package mymains;

import myhelpers.Animal;
import myhelpers.Cat;
import myhelpers.Mammal;

public class MyTest8 {

	public static void main(String[] args) {
		Animal myAnimal = new Cat();
		
		myAnimal.makeASound();
		
		Cat myCat = (Cat) myAnimal;
		
//		Mammal myMammal = new Mammal();
//		myMammal.makeASound();
		
		myCat.pur();
		
		myCat.makeASound();
		
		Dog myDog = new Dog();
		
		Animal theReadAnimal = new Animal();
		
		System.out.println(myAnimal instanceof Animal);
		System.out.println(myAnimal instanceof Mammal);
		System.out.println(myAnimal instanceof Cat);
		
		System.out.println(myCat instanceof Cat);
		// System.out.println(myCat instanceof Dog);
		System.out.println(theReadAnimal instanceof Cat);
		
		
		Animal animal1 = new Animal("q", "male");
		Animal animal2 = new Animal("q", "male");
		
		System.out.println(animal1.equals(animal2));
		
		System.out.println(animal1);
		System.out.println(animal1.toString());
		
		
		
	}

}
