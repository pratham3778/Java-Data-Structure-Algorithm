package JavaInterviewCheatSheet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepeatingEle {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,2};

        Map<Integer, Integer> hmap = new HashMap<>();

        for(int val : arr) {
            hmap.put(val, hmap.getOrDefault(val, 0) + 1);
        }

        //print non repat ele
        for(Map.Entry<Integer, Integer> maps : hmap.entrySet()) {
            if (maps.getValue() > 1) {
                //System.out.print(maps.getKey() + " ");
            }
        }


        Set<Integer> seen = new HashSet<>();
        Set<Integer> dupli = new HashSet<>();

        for(int val : arr) {
            if (!seen.add(val)) {
                dupli.add(val);
            }
        }

        System.out.println(dupli);
        
    }
}
