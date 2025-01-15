package Arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        /* TC : O(N log N)  & SC : 0(1)
        Arrays.sort(nums);
        int longest = 1;
        int current = 1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i] != nums[i-1]) {
                if(nums[i] == nums[i-1]+1) {
                current++;
                } else {
                longest = Math.max(longest, current);
                current = 1;
                }
            }
        }
        return Math.max(longest,current); */

        // TC : 0(N) & SC : 0(N)
        HashSet<Integer> numSet = new HashSet<>();
        for(int num : nums) {
            numSet.add(num);
        }
        int longest = 0;
        for(int num : numSet) {
            if(!numSet.contains(num -1)) {
                int currNum = num;
                int current = 1;

            while(numSet.contains(currNum + 1)) {
                currNum++;
                current++;
            }
            longest = Math.max(longest, current);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();

        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence: " + lcs.longestConsecutive(nums));

        int[] nums2 = {1, 2, 0, 1};
        System.out.println("Longest Consecutive Sequence: " + lcs.longestConsecutive(nums2));
    }
}
