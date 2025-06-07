package CollectionFramework;
// Comparable is a default natural sorting order 
// String class and all wrapper class already implements comparable interface
// present in java.lang package
// contains one method - compareTo(T);
// eg : Obj1.compareTo(Obj2)
// return -ve if Obj1 has come before Obj2
// return +ve if Obj1 has come after Obj2
// return 0 if Obj1 and Obj2 are equals


public class Comparable {

    public static void main(String[] args) {
        System.out.println("A".compareTo("B"));
        System.out.println("B".compareTo("A"));
        System.out.println("A".compareTo("A"));
    }
}
