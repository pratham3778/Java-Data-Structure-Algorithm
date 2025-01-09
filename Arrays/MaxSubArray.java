package Arrays;

public class MaxSubArray {

    public static int max(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i=0; i<nums.length;i++) {
            sum += nums[i];
            
            if(sum > max) {
                max = sum;
            }
            
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = max(nums);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
