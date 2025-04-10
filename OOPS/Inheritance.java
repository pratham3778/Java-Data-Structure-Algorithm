// Inheritance is a mechanism where a child class derives properties and behaviou from parent class
// Inhertiance is a process to create hierarchy of class
// Inheritance creates is-a-relationship between objects
// Along with inheritance, we often use upcasting and downcasting to manage object references more effectively.
// Creating a object of child class and then assigning it to parent class object is called upcasting
// Creating a object of parent class and then assigning it to child class object is called downcasting


//parent class
    class Animal {
        public void eat() {
            System.out.println("This animal eats food");
        }
    }

    //child class
    class Dog extends Animal {
        public void bark() {
            System.out.println("The dog barks");
        }
    }

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); //inherited method from animal
        myDog.bark(); //dog's own method


        // Upcasting: child object reffered by parent class
        Animal a = new Dog();
        a.eat();

        // Downcasting : Converting parent reference back to child
        Dog d1 = (Dog) a;
        d1.bark();

    }
}


// TYPES OF INHERITANCE 

// single inheritance - a class inherits from single parent class
// multilevel inheritance - a class is derived from a class, which is also derived from another class
// hierarchical inheritance - multiple class inherits from single parent class
// hybrid inheritance - combination of two or more type of inheritance
// Java does not support multiple inheritance with classes to avoid ambiguity and complexity, particularly the Diamond Problem(two parent classes have a method with the same signature).


// To solve this, Java allows multiple inheritance through interfaces, because interfaces don’t hold state