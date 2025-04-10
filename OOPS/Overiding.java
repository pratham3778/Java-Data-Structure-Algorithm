// Method Overiding - When a child class redefines a method from its parent class with same signature
// mthod overiding is also called runtime polymorphism (call gets resolved at runtime)
// eg: imagine a smart door - different type of door(manual , automatic) have different ways to open

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Overiding {
    public static void main(String[] args) {
        Animal d = new Dog(); // Upcasting
        d.sound();            // Should call Dog's overridden method
    }
}
