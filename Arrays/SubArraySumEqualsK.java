package Arrays;

import java.util.HashMap;

public class SubArraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        //BRUTE FORCE : TC:0(n^2) SC:0(1)
        /*int count = 0;

        for (int start = 0; start < nums.length; start++) {
            int sum = 0;

            for (int end = start; end < nums.length; end++) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count; */

        //OPTIMAL : TC: 0(n) & SC:0(n)
        int count = 0;
        int runningSum = 0;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1);

        for (int num : nums) {
            runningSum += num;

            if (prefixSumMap.containsKey(runningSum - k)) {
                count += prefixSumMap.get(runningSum - k);
            }
            prefixSumMap.put(runningSum, prefixSumMap.getOrDefault(runningSum, 0) + 1);
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1};
        int k1 = 2;

        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        System.out.println(subarraySum(nums1, k1));
        System.out.println(subarraySum(nums2, k2));
    }
    
}
