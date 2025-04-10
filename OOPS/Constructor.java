// Constructor is a special method called when an object is created to initialize it.
// it has same name as the class, does not have a return type
// eg : when you move to a new appartment - you can set up your furniture and appliances

//types: 
// 1. Default const : Provided by java if no constructor is defined.
// 2. No-arg const : a constructor with no parameters
// 3. parameterized const : a constructor with paramater to initalize specific values

public class Constructor {
    
    String name;
    int age;

    //no-args constructor
    Constructor() {
        name = "John";
        age = 20;
        System.out.println("Default const called !");
    }

    //parameterized constructor
    Constructor(String n, int a){
        name = n;
        age = a;
        System.out.println("Parameterized const");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor("Pratham", 21);

        c1.display();
        c2.display();
    }
}
