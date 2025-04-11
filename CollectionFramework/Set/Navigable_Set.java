package CollectionFramework.Set;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

// Navigabale set is child interface of SortedSet
// it extends capapbility of sorted set with navigate method
// has additional mehtods for navigation and quering sorted set
// mehtods : lower(), floor(), ceiling(), higher(), pollFirst(), pollLast()
public class Navigable_Set {
    public static void main(String[] args) {
        NavigableSet<Integer> sorted = new TreeSet<>();

        sorted.add(50);
        sorted.add(10);
        sorted.add(40);
        sorted.add(20);
        sorted.add(30);

        System.out.println(sorted);
        //System.out.println(sorted.lower(40)); //element lower than the mentioned value is returned
        //System.out.println(sorted.floor(32)); //element before than the mentioned value is returned
        //System.out.println(sorted.ceiling(40)); //return least ele in set , greater than or equal to thengiven eleemnt
        //System.out.println(sorted.higher(33)); //return the higher ele in set , greater than given element
        //System.out.println(sorted.pollFirst()); //return first eleement
        System.out.println(sorted.pollLast()); //return last element

    }
}
