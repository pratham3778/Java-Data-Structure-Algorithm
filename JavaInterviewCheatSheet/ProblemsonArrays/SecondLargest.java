package JavaInterviewCheatSheet;

import java.util.*;

public class SecondLargest {
    static int secL(int[] nums) {
        int largest  =nums[0];
        int secLargest = -1;

        for(int i=0;i<nums.length;i++) {
            if (nums[i] > largest) {
                secLargest = largest;
                largest = nums[i];
            } else if (nums[i] < largest && nums[i] > secLargest) {
                secLargest = nums[i];
            }
        }

        return secLargest;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,1,5,4};
        Arrays.sort(nums);
        System.out.println(nums[nums.length-2]);

        //System.out.println(secL(nums));
    }
}
