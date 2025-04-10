// Method overloading : defining multiple mehtods in the same class with same name but different parameters
// method overloading is also called compile time polymorphism - call gets resolved at complie time
// eg : imagine a smart door - the door can be opened using key, a password , or fingerprint

public class Overload {
    public int add(int a , int b) {
        return a + b;
    }
    public double add(double a , double b) {
        return a + b;
    }
    public int add(int a , int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Overload calci = new Overload();

        System.out.println(calci.add(1, 2));
        System.out.println(calci.add(2.1, 3.1));
        System.out.println(calci.add(1, 2, 3));
    }
}
