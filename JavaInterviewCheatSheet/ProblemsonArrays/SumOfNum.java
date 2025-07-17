package JavaInterviewCheatSheet;

import java.util.Arrays;

public class SumOfNum {
    public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    //calSum(nums);
    int sum = Arrays.stream(nums).sum();
    System.out.println(sum);
    }

    /*private static void calSum(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum = sum + nums[i];
        }

        System.out.println(sum);
    }*/
}
