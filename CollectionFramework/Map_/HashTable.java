package CollectionFramework.Map_;

import java.util.*;

// hashtable is very old introduced in jdk 1.1
// it is also called as legacy map / legacy collection API
// stores value in k-v pairs
// hashtable is syncronized 
// not allow null key and null  
// intital capacity is 11 and load factor is 0.75
// implement map interface

public class HashTable {
    public static void main(String[] args) {
        Map<String, Integer> htab = new Hashtable<>();
        htab.put("Pratham", 100);
        htab.put("Vishal", 2000);
        htab.put("Nisarg", 3000); 
        
        System.out.println(htab);
        System.out.println();
    }
}
