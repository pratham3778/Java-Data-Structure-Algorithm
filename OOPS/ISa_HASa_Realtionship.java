/*Aspect	           IS-A Relationship	                                   HAS-A Relationship
Type	             - Inheritance	                                            - Composition / Aggregation
Represents	         - "Is a type of"	                                        - "Has a part of"
Defination           - a child class inherits from parent class(using extends)  - directly access without extend keywor we craete object of that class*/ 



// IS - A Relationship

class Animalssss {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dogssss extends Animalssss {
    void bark() {
        System.out.println("The Dog barks");
    }
}


public class ISa_HASa_Realtionship {
    public static void main(String[] args) {
        Dogssss a = new Dogssss();
        a.eat();
        a.bark();

        Car c = new Car();
        c.startCar();
    }
}


// HAS - A Relationship

class Engine {
    void start() {
        System.out.println("Engine is starting....");
    }
}

class Car {
    private Engine e = new Engine();

    void startCar() {
        e.start();
        System.out.println("Car is starting");
    }
}
