package CollectionFramework.Map_;

import java.util.LinkedHashMap;
import java.util.Map;

// LinkedHashMap is the child class of HashMap.
// LinkedHashMap is similar to HashMap with additional feature of maintaining insertion order.
// LinkedHashMap provide constant-time performance O(1) for basic operation such as get, put and remove, similar to Hashmap. (Considering hash function distributes elements properly among the buckets.)
// It is not thread-safe.

public class LinkedHashmap {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap();
        map.put(1, "One");
        map.put(4, "Four");
        map.put(2, "Two");
        map.put(3, "Three");

        // System.out.println(map);

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
