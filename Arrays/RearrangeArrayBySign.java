package Arrays;

import java.util.Arrays;

public class RearrangeArrayBySign {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posIdx = 0;
        int negIdx = 0;
        while(nums[posIdx] < 0) {
            posIdx++;
        }
        while(nums[negIdx] > 0) {
            negIdx++;
        }

        for(int i=0;i<nums.length;i++) {
            if(i % 2 == 0) {
                result[i] = nums[posIdx++];
                while(posIdx < nums.length && nums[posIdx] < 0) {
                    posIdx++;
                }
            } else {
                result[i] = nums[negIdx++];
                while(negIdx < nums.length && nums[negIdx] > 0) {
                    negIdx++;
                }
            }
        }
        return result;
        }

        public static void main(String[] args) {
        RearrangeArrayBySign r = new RearrangeArrayBySign();   
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] reArray = r.rearrangeArray(nums);

        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("Rearranged array: " + Arrays.toString(reArray));
    }
}
