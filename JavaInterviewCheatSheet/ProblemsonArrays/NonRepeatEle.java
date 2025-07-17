package JavaInterviewCheatSheet;

import java.util.*;

public class NonRepeatEle {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,2};

        Map<Integer, Integer> hmap = new HashMap<>();

        for(int val : arr) {
            hmap.put(val, hmap.getOrDefault(val, 0) + 1);
        }

        //print non repat ele
        for(Map.Entry<Integer, Integer> maps : hmap.entrySet()) {
            if (maps.getValue() == 1) {
                System.out.print(maps.getKey() + " ");
            }
        }
    }
}
