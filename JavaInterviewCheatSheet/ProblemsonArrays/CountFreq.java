package JavaInterviewCheatSheet;

import java.util.*;

public class CountFreq {

    static void fq(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            map.put(num, map.getOrDefault(num , 0) +1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }

    }
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};

        fq(arr);
    }
}
