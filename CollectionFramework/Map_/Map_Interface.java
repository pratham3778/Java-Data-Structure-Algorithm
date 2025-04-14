package CollectionFramework.Map_;

import java.util.HashMap;
import java.util.Map;

// Map is not a part of Collection interface but it is part of Collection Framework
// Map is data sructure in java that stores Key-Value Pairs using hash table implementation
// Key must be unique , values can be duplicate
// methods - put(), get(), containsKey(), containsValue(), isEmpty(), size(), remove(), putAll(), clear()

// ENTRY method - a key-value pair in the map known as ENtry
// Entry is the nested interface in Map
// methods : getKey(), getValue(), setValue(), comparingByKey(), comparingByValue()

public class Map_Interface {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        // System.out.println(map);

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }
}
