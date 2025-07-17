package JavaInterviewCheatSheet;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    static int major(int[] arr, int size){ 
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            int val = map.getOrDefault(arr[i], 0);
            map.put(arr[i], val + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > size/2) {
                return entry.getKey();
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,2,3,3,3,3,3};
        int size = arr.length;
        //System.out.println(major(arr, size));


        //BRUTE FORCE 
        for(int i =0;i<size;i++) {
            int count = 0;
            for(int j=0;j<size;j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > size/2) {
                System.out.print(arr[i]);
                break;
            }
        }
    }
}
