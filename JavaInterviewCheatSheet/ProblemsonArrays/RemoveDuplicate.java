package JavaInterviewCheatSheet;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    static void remo(int[] arr) {
        Set<Integer> set = new HashSet<>();
        
        for(int num : arr) {
            set.add(num);
        }
        int 

        System.out.println(set);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};

        remo(arr);

    }
}