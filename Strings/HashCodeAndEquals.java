package String;

import java.util.HashMap;
import java.util.Objects;


// (==) Operator : it compares the references of two objects
// String s1 = "Hello";
// String s2 = "Hello";
// sout(s1==s2); it will return true
//     In Java, string literals like "Hello" are stored in a special memory area called the String Constant Pool (SCP).
//     When you write String s1 = "Hello";, it places "Hello" in the SCP.
//     When you write String s2 = "Hello";, Java reuses the same object from the SCP instead of creating a new one.
//     So both s1 and s2 point to the same reference, and s1 == s2 returns true.
// String s3 = new String("Hello");
// sout(s1==s3) it will return false because of different obj creation , and it gets stored in heap memeory
//     new String("Hello") creates a new object in the heap memory, even though "Hello" is already in the String Constant Pool (SCP).
//     So s1 points to the SCP object, and s3 points to a new object in the heap.
//     Hence, s1 == s3 compares two different references, and returns false.


// equals() method : it compare the content of two objects
// in an obj , we need to override the equals methtod for content comparison
// when we override the equals method , we lso need to override the hashCode() method for maintaing consistency


// hashCode() method : it returns a hash Code for the object
// it is used by hash-based data structure

// **
// if two objects are equals, they must have same hash code
// if two obj have same hashcode it does not necessarily mean they are same
// Overiding equals() method alone would fail with hashing DS like hashmap, hashset
// overriding hashcode method alone would not help in comapring objects 

public class HashCodeAndEquals {
    public static void main(String[] args) {
        Person p1 = new Person("Pratham", 21);
        Person p2 = new Person("Pratham", 21);

        //System.out.println("Are person1 and person2 equals: " + p1.equals(p2));

        HashMap<Person, String> hmap = new HashMap<>();
        hmap.put(p1, "Pratham");
        hmap.put(p2, "Person2");
        System.out.println(hmap);
        System.out.println("Are person1 and person2 equals: " + p1.equals(p2));
    }
}

class Person {
    private String name;
    private int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
