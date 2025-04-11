package CollectionFramework.Set;

// sorted set interface extends Set
// it does not allow null values
// it does not allow duplicate , and all elements are sorted in ASC order
// when we need return unique values and element should be in asc order we use Sorted Set

// methods : comparator(), subSet(from element, to element), headSet(toElement), tailSet(fromElement), first(), last()

import java.util.*;
public class Sorted_Set {
    public static void main(String[] args) {
        Comparator<Integer> comp = (i, j) -> {
            return j.compareTo(i);// for return descending order
        };

        SortedSet<Integer> sorted = new TreeSet<>(); //(comp); - call it to use comparator

        sorted.add(50);
        sorted.add(10);
        sorted.add(40);
        sorted.add(20);
        sorted.add(30);

        System.out.println(sorted);  //return in asc order
        //System.out.println(sorted.comparator());  //return in desc order , use comparator() to see it return null
        //System.out.println(sorted.subSet(10, 40));  //inlcude ofelement and element before toelement , excluding toelelemnt
        System.out.println(sorted.headSet(40)); // return values before headelelemt, exclduing headele
        System.out.println(sorted.tailSet(30)); // return value from toelemet including it

    }
}
