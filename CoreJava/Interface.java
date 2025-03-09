package CoreJava;

// Interface Ram with a default method
interface Ram { 
    default void fun() {
        System.out.println("Ram's fun()");
    }
}

// Interface Sham with a default method
interface Sham {
    default void fun() {
        System.out.println("Sham's fun()");
    }
}

// Class implementing both interfaces
public class Interface implements Ram, Sham {
    // Resolving ambiguity by overriding the fun() method
    @Override
    public void fun() {
        // Call Sham's method
        Sham.super.fun();  // Change to Ram.super.fun() to call Ram's method
    }

    public static void main(String[] args) {
        Interface d = new Interface();
        d.fun();  // Which method gets called? //sham
    }
}

