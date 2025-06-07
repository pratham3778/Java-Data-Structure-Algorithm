package CollectionFramework;

import java.util.Comparator;
import java.util.TreeSet;

// Comparator interface is present in java.util package 
// we can use comparator interface to define our own customized order
// compare(Obj1, Obj2);
// return -ve if Obj1 has come before Obj2
// return +ve if Obj1 has come after Obj2
// return 0 if Obj1 and Obj2 are equals

public class Compartor {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (i, j) -> Integer.compare(i, j);
            //Integer.compare(j, i); 
            //other way to write
            //return i.compareTo(j); //return ASC
            //return j.compareTo(i); //return DESC

        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(40);

        System.out.println(treeSet);
    }
}


/* //Q. Write a program to insert integer object into TreeSet where the sorting order is descending order. (using comparator)

import java.util.*;

class Compartor  {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (i, j) -> Integer.compare(j, i);
        
        
        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
        
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(40);
        
        
        System.out.println(treeSet);
    }
}
 */
