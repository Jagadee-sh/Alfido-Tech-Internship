// Base class
class Animal {
    void sound() {
        System.out.println("Animals make different sounds.");
    }
}

// Derived class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog says: Woof Woof");
    }
}

// Another derived class
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The cat says: Meow");
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Base class object
        Animal myDog = new Dog(); // Derived class object
        Animal myCat = new Cat(); // Another derived class object

        // Calling methods
        myAnimal.sound();
        myDog.sound(); // Method overridden
        myCat.sound(); // Method overridden
    }
}