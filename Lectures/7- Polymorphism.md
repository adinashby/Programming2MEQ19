# Polymorphism

## 1. First glance at Polymorphism

You might have realized that in the previous example (`Animal`, `DomesitcatedAnimal` and `Dog`) copy constructor in the `Dog` class calls the copy constructor in the `Animal` class . The `Animal` class copy constructor takes one parameter `Animal animal`, but when we were calling the method, we passed `Dog dog` to it. That looks wrong since the data type does not match. However, Java did not complain about it, there was no error when we execute the code. This is called `polymorphism`. You can understand it like this: The Animal class copy constructor requires a parameter of `Animal`, and since the `Dog` class extends the `Animal` class, which means `Dog` is a special kind of `Animal`. In this case, passing a dog is passing a special kind of animal to the method, the two data types match.

In general, **if a method requires a parameter of class B, when you call the method you can pass an object of class B, or you can also pass an object of any subclass of class B.**

### 1.1. Example

```java
public class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public void animalSound(String name) {
        System.out.println("The animal " + name + " makes a sound");
    }
}
```

```java
public class Cat extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The cat says: meow");
    }

    @Override
    public void animalSound(String name) {
        System.out.println("The cat " + name + " says: meow");
    }
}
```

```java
public class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The dog says: woof");
    }

    @Override
    public void animalSound(String name) {
        System.out.println("The dog " + name + " says: woof");
    }
}
```

```java
public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myDog = new Dog();
    Animal myCat = new Cat();

    myAnimal.animalSound();
    myDog.animalSound();
    myCat.animalSound();

    myAnimal.animalSound("Wolfy");
    myDog.animalSound("Fluffy");
    myCat.animalSound("Berry");
}
```

## 2. A close look at Polymorphism

Now let's take a look at another example: If we have a class `Animal`, that contains a method a static method `void makeSound(Animal animal)` and an abstract method `abstract void makesound()`, two classes `Dog` and `Cat` extend from the `Animal` class and each of them override the abstract method:

```java
public abstract class Animal {
    public static void makeSound(Animal animal) {
        animal.makeSound();
    }

    public abstract void makeSound();
}
```

```java
public class Cat extends Animal {

    public void makeSound() {
        System.out.print("Meow");
    }
}
```

```java
public class Dog extends Animal {

    public void makeSound() {
        System.out.print("Woof");
    }
}
```

Now if we call the method `makeSound(Animal animal)` in the `Animal` class and pass a cat object to it, it will call the `makeSound()` method in the `Cat` class, while if we pass a dog object to it, it will call the `makeSound()` method in the `Dog` class. In this case, even though the method `makeSound(Animal animal)` is hard coded (only one version), but since we can pass different objects to it, how the method really will behave depends on the class of the object. A method can behave differently based on the parameter, this is called `polymorphism`.

```java
public static void main() {
    Cat c = new Cat();
    Animal.makeSound(c);		// call makeSound() in Cat class, "Meow"

    Dog d = new Dog();
    Animal.makeSound(d);		// call makeSound() in Dog class, "Woof"
}
```
