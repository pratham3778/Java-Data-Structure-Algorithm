package OOPS;

// static keyword in java indicates that the field or method belong to class rather than an instance

//static keyword is used for memory mgmt

// static variable are class level variable shared among all instance of the clas

// static method are that can be created without creating an instance of class

// EXAMPLE : Show school name - shared by all students
class demo {
    static void print() {
        System.out.println("Im a static method");
    }
}
public class StaticMem {
    //static keyword
    static int count  = 0; //static variable 
    static void display() {
        System.out.println("I'm a static keyword" + " - " +count);
    }
    public static void main(String[] args) {
        StaticMem.display(); 
        demo.print(); // static method - no object creation
    }
    
}
