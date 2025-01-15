package Arrays;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int index = -1;
        for(int i=nums.length-2;i>=0;i--) {
            if(nums[i] < nums[i+1]) {
                index = i;
                break;
            }
        }
        if(index != -1) {
        for(int i=nums.length-1;i>index;i--) {
            if(nums[i] > nums[index]) {
                int swap = nums[i];
                nums[i] = nums[index];
                nums[index] = swap;
                break;
                }
            }
        }
        reverse(nums, index + 1, nums.length - 1);

    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        
}
public static void main(String[] args) {
    NextPermutation np = new NextPermutation();
    int[] nums = {1, 2, 3};
     System.out.println("Original array: " + Arrays.toString(nums));
    np.nextPermutation(nums);
    System.out.println("Next permutation: " + Arrays.toString(nums));
}
}
