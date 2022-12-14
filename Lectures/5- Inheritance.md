# Inheritance

## 1. What is inheritance

`Inheritance` is an OOP feature that helps you to keep you code DRY and easy to maintain.

Key definition: **For two classes A and B, if A is a special kind of B**, then we say **A inherits from B**. In this case, B is called the **superclass** or (parent), A is called the **subclass** or (child). When you create class A, add `extends B` in the header of the class.

Examples:

- `Cat` is a special kind of `Animal`: `Cat` is the subclass, `Animal` is the superclass
- `Basketball` is a special kind of `Ball`: `Basketball` is the subclass, `Ball` is the superclass

```java
public class Cat extends Animal {		// Cat is a special kind of Animal
}
```

Notice: **X contains Y is not inheritance**, you should create collection of Y as a data member in X

```java
public class Library {
    private ArrayList<Book> books;		// Library contains Book
}
```

Inheritance can be a **chain**, for example: `Cat` is a special kind of `DomesticatedAnimal`, and `DomesticatedAnimalis` a special kind of `Animal`. The sub-subclass also inheritances from the super-super class. (`Cat` also inheritances from `Animal`)

```java
public class DomesticatedAnimal extends Animal{		// DomesticatedAnimal is a special kind of Animal
}

public class Cat extends DomesticatedAnimal{		// Cat is a special kind of DomesticatedAnimal
}
```

When there is inheritance between classes, the relationship between them looks like a family tree, sometimes you may hear people use the term "family" like in the previous example, `Animal`, `DomesticatedAnimal` and `Cat` are in a "family". The real technical term for this is `hierarchy`. So we say `Animal`, `DomesticatedAnimal` and `Cat` are in a `hierarchy`.

## 2. What inheritance can bring us

When you have two classes A and B, A (subclass) inherits from B (superclass), B (superclass) will give everything it has to A, without noticing A.

For example if you have a superclass `Animal` that contains data members `name` and `age`, then its subclass `Dog` will also have it.

```java
// Animal Class with 2 data members and 4 methods
public class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

```java
// Dog class extends from Animal class, so it will get all data members and methods from it
// There are 1 data member and 2 methods defined in this class, but it also gets the 2 data members and 4 methods from the super classs, so totally there are 3 data members and 6 methods in the Dog class.
public class Dog extends Animal {
	private int sportHour;

	public int getSportHour() {
        return sportHour;
	}

	public void setSportHour(int sportHour) {
        this.sportHour = sportHour;
	}
}
```

If you only have two classes (one superclass and one subclass), then this seems pointless. However, if you have one superclass with many subclasses, the benefit will be much clear. Let's say you have a super class `Animal`, with 5 subclasses: `Dog`, `Cat`, `Monkey`, `Tiger and` `Duck`, if you don't use inheritance, you will have to create data member `name` and `age` for each of them, also the getters and setters, your code will be WET and difficult to maintain. **Inheritance allows you to defined the shared data members and methods in a super class so you only have to define them once.**

## 3. An example of inheritance

When you have to code a hierarchy with many classes, **always follow a top-down order**, which means starting with the super class, then subclasses, then sub-subclasses...

### 3.1 Define the super class

There is no difference between defining the top super class and a normal class before we learn inheritance. You just need to define it in the old way that we usually do. Except the `equals()` method, which will be explained in `3.2.2`.

### 3.2 Defining a subclass

When you define a subclass, first you should remember, there are some data members and methods defined in the superclass are given to it.

#### 3.2.1 Defining constructors

In a subclass, data members may partly defined in its superclass, and partly defined in the subclass itself. Constructors should initialize all data members, not only the ones defined in the subclass.

However, you don't want to make your code WET, the super class has constructors that can be used to initialize the data members defined in the superclass, there is no need to re-invent them again. In this case, you may need to call the constructors in the super class. And remember, **calling the constructor in the super class can only be in the first row in the subclass constructor**. To do so, use the keyword `super` to represent the super class. For example: in `Dog` class (extends `Animal`), `super()` represents the `Animal` class default constructor `Animal()`.

```java
/**
 * Animal Class with 3 constructors
 */
public class Animal {
    private String name;
    private int age;

	public Animal() {
        this.name = "";
        this.age = -1;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(Animal animal) {
        this.name = animal.name;
        this.age = animal.age;
    }
}
```

```java
/**
 * Dog class with 1 additional data member
 */
public class Dog extends DomesticatedAnimal {

    private int sportHour;

    public Dog() {
        super();			// calling the default constructor in the Animal class
        this.sportHour = 0;
    }

    public Dog(int sportHour, String name, int age) {
        super(name, age);	// calling the second constructor in the Animal class
        this.sportHour = sportHour;
    }

    public Dog(Dog dog) {
        super(dog);			// calling the copy constructor in the Animal class
        this.sportHour = dog.sportHour;
    }

}
```

### 3.2.2 Defining equals()

There are two different ways to write the equals() , the `overload` one and the `override` one. In Programming 1 and the very beginning of Programming 2 we use the overload one, which is an equals method to compare with the object of the same class, for example a clock compares with another clock, a student compares with another student, in this case, the parameter of the `equals()` is the same as the class. The override version takes `Object object` as the parameter, no matter what class it is.

Comparing the two different version of `equals()`, you may find that the overload version is much shorter than the orverride version. And it does the same thing as the `part 3` of the override version, which go through all data members of the two objects and check if they have the same values or not.

```java
// overload equals
public boolean equals(Animal animal) {
    return this.age == animal.age &&
            this.name.equals(animal.name) &&
            this.type.equals(animal.type) &&
            this.gender.equals(animal.gender);
}
```

```java
// override equals
@Override
public boolean equals(Object obj) {
    // part 1
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;

    // part 2
    final Animal other = (Animal) obj;

    // part 3
    if (this.age != other.age)
        return false;
    if (!Objects.equals(this.name, other.name))
        return false;
    if (!Objects.equals(this.type, other.type))
        return false;
    if (!Objects.equals(this.gender, other.gender))
        return false;
    return true;
}

```

- `part 1` and `part 2` in the override version are new:

  - first `if` in `part 1`: you don't have to compare the data members of two objects to know if they are equal or not. For example. if you have the follow code:

    ```java
    Dog d = new Dog();
    Animal a = d;
    ```

    Even though there are two references, `d` and `a`, but actually they are pointing at the same object. Since there is only one object, it is pointless to go through the data member twice to see if they are the same or not, that's what the first `if` in part 1 does, compares the address of the two objects, if the address is the same, then directly return `true`.

  - second `if` in `part 1`: `equals()` is a non-static method, so you have to call through an object. Also we cannot call an method if the object is `null`, in that case, we know in `obj1.equals(obj2)`, `obj1` for sure is not null, then if `obj2` is `null`, then these two objects cannot be equal, so the second if will directly return `false`.

  - third `if` in `part 1`: two classes may accidently have the same data member, for example, `Dog` class contains `name`, `age`, `gender`, and `Cat` class also contains `name`, `age`, `gender`. And accidently a cat and a dog have the same values for the `name`, `age` and `gender`, but it would be very strange if we say, ok, this cat is the same as the dog. Here the third `if` will use the `getClass()` method to check what classes each object belongs to, and if they belong to different classes, then it will directly return `false`.

  - `part 2`: after `part 1`, we know the two references are pointing at two different objects, and null of them have value `null`, also the real classes of the two objects are the same. The next step is to make sure second object is the same class with the first object.

    ```java
    Animal a = new Animal();
    Object o = new Animal();
    ```

    In this example, there are two `Animal` objects, both created with default constructor, so have the same values for data members. However, one is referenced through an `Animal` reference, while the other referenced through an `Object` reference. If we try to directly use the `equals()` in the `Animal` class to compare the two, the `a` can access all data members since it is an `Animal` reference, but `o` cannot access any `Animal` data members, you have to first cast it down to the `Animal` class first, then compare the two. `Part 2` does the casting for the parameter.

### 3.2.3 Defining toString()

Same as the constructors, the subclass usually has to use the superclass `toString()` in its own `toString()` method. The syntax to call a `toString()` method of the superclass from the subclass is `super.toString()`

```java
/**
 * superclass toString method, takes care of 4 data members defined in the super class
 */
@Override
public String toString() {
    String str = "";

    str += String.format("%-10s: %s\n", "Name", name);
    str += String.format("%-10s: %s\n", "Type", type);
    str += String.format("%-10s: %d\n", "Age", age);
    str += String.format("%-10s: %s\n", "Gender", gender);

    return str;
}
```

```java
/**
 * subclass toString method, call the super.toString() method to handle the first 4 data members, and only use one * additional String.format() to handle the additional data member.
 */
@Override
public String toString() {
    String str = "";

    str += super.toString();		// calling the superclass toString() method
    str += String.format("%-10s: %d\n", "CloseLevel", closeToHumanLevel);

    return str;
}
```

## 4. Object class

In Java there is a special class names `Object`, technically, every class extends from `Object`. The object class contains some basic methods, such as `toString()`, `equals()`, so whatever class extends from it will automatically have these methods.

## 5. Access Modifier

There are 4 access modifiers: `public`, `private`, `protected`, `default`

- `public`: no restriction, whatever class at anywhere have access to the data member of method

- `private`: most strict restriction, only the class where the data member or method is defined has access to it.

- `protected`: not only the class itself can use it, but also

  - (1) the subclasses can also use it (your families),

  - (2) classes in the same package (your neighbors).

    Using `protected` will accelerate the speed of developing. However, it does sacrifice the security.

- `default`: not only the class itself can use it, but also classes in the same package (your neighbors). Barely used.

## 6. Casting

In Programming 1 we have learned the primitive data types, and we can cast one type to another one. There are two different types of casting:

    1. auto-casting: to cast a less accurate data type to a more accurate data type, or two data types in the same accurate level, Java can cast the type for you. For example: `double num = 3;`  casts `int` to `double`; or `int num = 'a'` castes `char` to `int`.

2. manual-casting: to cast a more accurate data type to a less accurate data type, Java cannot cast the type automatically for you, you have to use `(type)` to cast manually. For example: `int num = (int) 3.14;` casts `double` to `int` .

When we are dealing with inheritance, our classes can also be casted, more specifically, a super class can be casted to a subclass type, and a subclass can be casted to a superclass type:

1.  sub to super: A superclass reference can always point at a subclass object: `Animal animal = new Dog();`, this casts the `Dog `object into a `Animal` object. But keep in mind, since the object is created as a dog, so the true data type is always a Dog, however, since it is casted to an `Animal`, then it can only use the methods defined in the `Animal` class. You can understand it as there is a prince, that has been turned into a frog. Deep inside it is still a prince, however, it cannot only jump instead of walk.

2.  super to sub: A superclass can be cast to a subclass, only if the object is deep inside the subclass type. You need to use `(subclass)` to cast it manually. You can understand it as: the frog prince can be turned back to a prince, but that need a kiss (manually). And not every frog can turn into a prince, only if the frog was a prince at the very beginning.

    ```java
    public class Animal {
        public void eat() {

        }

        public void sleep() {

        }
    }
    ```

    ```java
    public class Dog extends Animal{
        public void playWithHuman() {

        }
    }
    ```

    ```java
    public static void main() {
        Dog d = new Dog(); 			// d can eat, sleep and playWithHuman
        Animal a = new Dog();		// a can only eat and sleep, but not playWithHuman

        Dog d2 = (Dog) a;			// a is casted to a Dog, now it can eat, sleep and playWithHuman
        Dog d3 = (Dog) new Animal(); // Error, the object is Animal at beginning, cannot be casted to Dog
    }
    ```

## 7. Instanceof

In the previous example, we have `Animal` and `Dog`, if we have another class `Cat` extends from `Animal` and a `Zoo` class that contains different animals (only cat and dog here) inside.

```java
public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<Animal>();

    public void addAnimal(Animal animal) {
         animals.add(animal);
    }

    public ArrayList<Animal> getAnimals() {
          return animals;
    }
}
```

If we add Dog or Cat to `animals`, since the data type is `List<Animal>`, it will automatically cast the data type of the element to `Animal`, in this case, we cannot directly call the `playWithHuman()` method from the `Dog` class through an element of the `animals`. Instead, we have to cast it to `Dog` first. But there is a problem here, not all animals are Dog, trying to cast a Cat to a Dog will make our code crush. So we want to only cast an element that is a dog to `Dog` and an element that is a cat to `Cat`.

Here we need a new operator `instanceof`. `instanceof` is like a boolean method, that returns true or false. the syntax is `obj instanceof Class`. If the real class of the object is the same as the second parameter or a subclass of the second parameter, then `instanceof` will equal to `true`, else `false`.

```java
public static void main() {
    Animal a = new Dog();						   // the real type is Dog
    System.out.print(a instanceof Dog);				// true, Dog is Dog
    System.out.print(a instanceof Animal);           // true, Dog is subclass of Animal
    System.out.print(a instanceof Cat);				// false, Dog is not Cat or subclass of Cat
}
```

Back to the previous example, if we want to all dogs in the zoo to play with human, we can use the following code:

```java
public static void main() {
    ...
    for (Animal animal : animals)
        if (animal instanceof Dog)   				// only if the animal is Dog
            ((Dog) animal).playWithHuman();			// cast it to Dog, then call the playWithHuman() method
}
```
